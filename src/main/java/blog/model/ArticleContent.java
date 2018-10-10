package blog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table
public class ArticleContent implements Serializable {

    @Id
    @Column
    private String contentId;

    private String  articleInfoId;
    private String content;

    public ArticleContent() {
    }

    public ArticleContent(String  contentId, String  articleInfoId, String content) {
        this.contentId = contentId;
        this.articleInfoId = articleInfoId;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:40
 **/
