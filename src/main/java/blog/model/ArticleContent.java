package blog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "articleContent")
public class ArticleContent implements Serializable {

    @Id
    @Column
    private String contentId;

    private String  articleInfoId;

    //html语言
    @Column(columnDefinition="TEXT", nullable=true)
    private String htmlContent;

    //富文本语言
    @Column(columnDefinition="TEXT", nullable=true)
    private String editorContent;


    public ArticleContent() {
    }

    public ArticleContent(String  contentId, String  articleInfoId, String htmlContent) {
        this.contentId = contentId;
        this.articleInfoId = articleInfoId;
        this.htmlContent = htmlContent;
    }

    public String  getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String  getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(String  articleInfoId) {
        this.articleInfoId = articleInfoId;
    }

    public String getEditorContent() {
        return editorContent;
    }

    public void setEditorContent(String editorContent) {
        this.editorContent = editorContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:40
 **/
