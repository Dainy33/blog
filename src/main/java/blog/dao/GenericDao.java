package blog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

@Repository
public abstract class GenericDao<T extends Serializable, PK> {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void save(T object) {
        getSession().save(object);
    }

    public void update(T object) {
        getSession().update(object);
    }

    public void remove(T object) {
        getSession().delete(object);
    }

}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 17:38
 **/
