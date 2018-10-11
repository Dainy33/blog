package blog.service;

import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IArticleService {

    public String createArticleInfo(ArticleInfo articleInfo);

    public boolean createArticleContent(ArticleContent articleContent);

    public boolean createArticleComment(ArticleComment articleComment);

    public boolean deleteArticleInfoByInfoId(String infoId);

    public boolean deleteArticleContentByInfoId(String infoId);

    public boolean deleteArticleCommentByInfoId(String infoId);

    public boolean deleteArticleContent(String contentId);

    public boolean deleteArticleComment(String commentId);

    public boolean updateArticleContent(ArticleContent articleContent);

    public List<ArticleInfo> getArticleInfoByType(String type);

    public List<Integer> getArticleInfoIdByType(String type);

    public List<Map<ArticleInfo,ArticleContent>> getArticleContentByInfo(ArticleInfo info);

    public List<Map<ArticleInfo,ArticleContent>> getArticleContentByInfoId(String infoId);

    public List<ArticleComment> getArticleCommentByInfoId(String infoId);

    public List<ArticleInfo>  getLatestTenArticleInfo();


}
