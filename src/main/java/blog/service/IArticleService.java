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

    public boolean deleteArticleInfo(String infoId);

    public boolean deleteArticleContentByInfoId(String infoId);

    public boolean deleteArticleContentByContentId(String contentId);

    public boolean deleteArticleComment(String commentId);

    public boolean updateArticleContent(ArticleContent articleContent);

    public List<ArticleInfo> getArticleInfoByType(String type);

    public List<Integer> getArticleInfoIdByType(String type);

    public Map<ArticleInfo,ArticleContent> getArticleContentByInfo(List<ArticleInfo> info);

    public Map<ArticleInfo,ArticleContent> getArticleContentByInfoId(List<String> infoId);

    public List<ArticleComment> getArticleCommentByInfoId(String infoId);


}
