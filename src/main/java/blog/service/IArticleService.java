package blog.service;

import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;

import java.util.List;

public interface IArticleService {

    public boolean createArticleInfo(ArticleInfo articleInfo);

    public boolean createArticleContent(ArticleContent articleContent);

    public boolean createArticleComment(ArticleComment articleComment);

    public List<ArticleInfo> getArticleInfoByType(String type);

    public ArticleContent getArticleContentByInfoId(Integer infoId);

    public List<ArticleComment> getArticleCommentByInfoId(Integer infoId);


}
