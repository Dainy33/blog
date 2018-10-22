package blog.service.implement;

import blog.dao.ArticleCommentDao;
import blog.dao.ArticleContentDao;
import blog.dao.ArticleInfoDao;
import blog.dao.BlogCommentDao;
import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.model.BlogComment;
import blog.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
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

    @Resource
    BlogCommentDao blogCommentDao;

    public String createArticleInfo(ArticleInfo articleInfo) {
        String articleInfoId = UUID.randomUUID().toString();
        articleInfo.setArticleInfoId(articleInfoId);
        articleInfo.setCreateDate(new Date());
        articleInfoDao.save(articleInfo);
        return articleInfoId;
    }

    public boolean createArticleContent(ArticleContent articleContent) {
        articleContent.setContentId(UUID.randomUUID().toString());
        articleContentDao.save(articleContent);
        return true;
    }

    public boolean createArticleComment(ArticleComment articleComment) {
        articleComment.setCommentId(UUID.randomUUID().toString());
        articleComment.setCreateDate(new Date().toString());
        articleCommentDao.save(articleComment);
        return true;
    }

    public boolean createBlogComment(BlogComment blogComment) {
        blogComment.setCommentId(UUID.randomUUID().toString());
        blogComment.setCreateDate(new Date().toString());
        blogCommentDao.save(blogComment);
        return true;
    }

    public boolean deleteArticleInfoByInfoId(String infoId) {
        articleInfoDao.deleteArticleInfoByInfoId(infoId);
        return true;
    }

    public boolean deleteArticleContentByInfoId(String infoId) {
        articleContentDao.deleteArticleContentByInfoId(infoId);
        return true;
    }

    public boolean deleteArticleCommentByInfoId(String infoId) {
        articleCommentDao.deleteArticleCommentByInfoId(infoId);
        return true;
    }

    public boolean deleteArticleContent(String contentId) {
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

    public List<Map<ArticleInfo, ArticleContent>> getArticleContentByInfo(ArticleInfo info) {
        return null;
    }

    public ArticleInfo getArticleInfoByInfoId(String infoId) {
        ArticleInfo articleInfo = articleInfoDao.getArticleInfoByInfoId(infoId);
        return articleInfo;
    }

    public ArticleContent getArticleContentByInfoId(String infoId) {
        ArticleContent articleContent = articleContentDao.getArticleContentByInfoId(infoId);
        return articleContent;
    }

    public List<ArticleComment> getArticleCommentByInfoId(String infoId) {
        List<ArticleComment> articleCommentLists = articleCommentDao.getArticleCommentByInfoId(infoId);
        return articleCommentLists;
    }

    public List<ArticleInfo> getLatestTenArticleInfo() {
        List<ArticleInfo> articleInfoList = articleInfoDao.getLatestTenArticleInfo();
        return articleInfoList;
    }

    public List<BlogComment> getBlogComment() {
        List<BlogComment> blogCommentList = blogCommentDao.getBlogComment();
        return blogCommentList;
    }

    private String currentTimeToString(){
        String stamp = String.valueOf(new Date().getTime());
        return stamp;
    }

    private String stampTimeToDate(String stamp){
        Date date =new Date();
        date.setTime(new Long(stamp));
        return date.toString();
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:01
 **/
