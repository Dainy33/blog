package blog.dao;

import blog.model.ArticleContent;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleContentDao extends GenericDao<ArticleContent,String> {
    public boolean deleteArticleContentByInfoId(String infoId){
        String hql = "delete from ArticleContent where articleInfoId = :articleInfoId";
        Query query = getSession().createQuery(hql);
        query.setParameter("articleInfoId",infoId);
        query.executeUpdate();
        return true;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 12:40
 **/
