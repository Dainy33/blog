package blog.dao;

import blog.model.ArticleComment;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleCommentDao extends GenericDao<ArticleComment,String> {

    public List<ArticleComment> getArticleCommentByInfoId(String articleInfoId){
        String hql = "from ArticleComment where articleInfoId = :articleInfoId";
        //from 后面要接类名           否则 QuerySyntaxException:XXX is not mapped
        //:后面不能有空格,要紧接占位符  否则 Space is not allowed after parameter prefix
        Query query = getSession().createQuery(hql);
        query.setParameter("articleInfoId",articleInfoId);
        return query.list();
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 12:40
 **/
