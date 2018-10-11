package blog.dao;

import blog.model.User;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao extends GenericDao<User, String> {

    public boolean isUserExists(String username) {
        boolean isExists = false;
        String hql = "select count(*) from User where username = :username";
        Query query = getSession().createQuery(hql);
        query.setParameter("username", username);
        Long count = (Long) query.uniqueResult();
        if(!count.equals(new Long(0))){
            isExists = true;
        }
        return isExists;
    }

    public User getUser(String username){
        String hql = "from User where username = :username";
        Query query = getSession().createQuery(hql);
        query.setParameter("username",username);
        return (User) query.uniqueResult();
    }



}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-11 12:36
 **/
