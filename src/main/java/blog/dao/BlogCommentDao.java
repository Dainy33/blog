package blog.dao;

import blog.model.ArticleComment;
import blog.model.BlogComment;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogCommentDao extends GenericDao<BlogComment,String> {
    public List<BlogComment> getBlogComment(){
        String hql="from BlogComment order by createDate desc";
        Query query=getSession().createQuery(hql);
        return query.list();
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 12:40
 **/
