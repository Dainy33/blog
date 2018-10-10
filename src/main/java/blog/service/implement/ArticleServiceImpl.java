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
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class ArticleServiceImpl implements IArticleService {

    @Resource
    ArticleInfoDao articleInfoDao;

    @Resource
    ArticleContentDao articleContentDao;

    @Resource
    ArticleCommentDao articleCommentDao;

    public String createArticleInfo(ArticleInfo articleInfo) {
        String articleInfoId = UUID.randomUUID().toString();
        articleInfo.setArticleInfoId(articleInfoId);
        articleInfoDao.save(articleInfo);
        return articleInfoId;
    }

    public boolean createArticleContent(ArticleContent articleContent) {
        articleContentDao.save(articleContent);
        return true;
    }

    public boolean createArticleComment(ArticleComment articleComment) {
        articleCommentDao.save(articleComment);
        return true;
    }

    public boolean deleteArticleInfo(String infoId) {
        return false;
    }

    public boolean deleteArticleContentByInfoId(String infoId) {
        return false;
    }

    public boolean deleteArticleContentByContentId(String contentId) {
        return false;
    }

    public boolean deleteArticleComment(String commentId) {
        return false;
    }

    public boolean updateArticleContent(ArticleContent articleContent) {
        return false;
    }

    public List<ArticleInfo> getArticleInfoByType(String type) {
        return null;
    }

    public List<Integer> getArticleInfoIdByType(String type) {
        return null;
    }

    public Map<ArticleInfo, ArticleContent> getArticleContentByInfo(List<ArticleInfo> info) {
        return null;
    }

    public Map<ArticleInfo, ArticleContent> getArticleContentByInfoId(List<String> infoId) {
        return null;
    }

    public ArticleContent getArticleContentByInfoId(String infoId) {
        return null;
    }

    public List<ArticleComment> getArticleCommentByInfoId(String infoId) {
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
