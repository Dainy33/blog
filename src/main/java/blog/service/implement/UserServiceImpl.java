package blog.service.implement;

import blog.dao.UserDao;
import blog.model.User;
import blog.service.IUserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Transactional
    public boolean createUser(String username, String password1, String password2) {
        if (password1.equals(password2)) {
            userDao.save(new User(username, password1));
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public boolean deleteUser(String username, String password) {
        if(isVarified(username,password)){
            userDao.remove(new User(username,password));
            return true;
        }
        return false;
    }

    @Transactional
    public boolean updateUser(String username, String password1, String password2) {
        if(isVarified(username,password1)){
            userDao.update(new User(username,password2));
            return true;
        }
        return false;
    }

    @Transactional
    public boolean ensureUser(String username, String password) {
        if(isExists(username)){
            User user = userDao.getUser(username);
            if(password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }

    private boolean isExists(String username) {
        boolean result = false;
        if (userDao.isUserExists(username)) {
            result = true;
        }
        return result;
    }

    private boolean isVarified(String username,String password){
        if(isExists(username)){
            User user = userDao.getUser(username);
            if(password.equals(user.getPassword())){
                return true;
            }
        }
        return false;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-11 09:38
 **/
