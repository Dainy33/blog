package blog.service.implement;

import blog.dao.ArticleCommentDao;
import blog.dao.ArticleContentDao;
import blog.dao.ArticleInfoDao;
import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Resource
    ArticleInfoDao articleInfoDao;

    @Resource
    ArticleContentDao articleContentDao;

    @Resource
    ArticleCommentDao articleCommentDao;

    @Transactional
    public boolean createArticleInfo(ArticleInfo articleInfo) {
        articleInfoDao.save(articleInfo);
        return true;
    }

    @Transactional
    public boolean createArticleContent(ArticleContent articleContent) {
        articleContentDao.save(articleContent);
        return true;
    }

    @Transactional
    public boolean createArticleComment(ArticleComment articleComment) {
        articleCommentDao.save(articleComment);
        return true;
    }

    @Transactional
    public List<ArticleInfo> getArticleInfoByType(String type) {
        return null;
    }

    @Transactional
    public ArticleContent getArticleContentByInfoId(Integer infoId) {
        return null;
    }

    @Transactional
    public List<ArticleComment> getArticleCommentByInfoId(Integer infoId) {
        List<ArticleComment> articleCommentLists = articleCommentDao.getArticleCommentByInfoId(infoId);
        return articleCommentLists;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:01
 **/
