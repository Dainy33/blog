package blog.dao;

import blog.model.ArticleInfo;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ArticleInfoDao extends GenericDao<ArticleInfo,Integer>{
    public boolean deleteArticleInfoByInfoId(String infoId){
        String hql = "delete from ArticleInfo where articleInfoId = :articleInfoId";
        Query query = getSession().createQuery(hql);
        query.setParameter("articleInfoId",infoId);
        query.executeUpdate();
        return true;
    }

    public List<ArticleInfo> getLatestTenArticleInfo() {
        String hql = "from ArticleInfo order by createDate desc";
        Query query =getSession().createQuery(hql);
        query.setMaxResults(10);
        return query.list();
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 12:39
 **/
