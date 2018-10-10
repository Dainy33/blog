package blog.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
public class ArticleContent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer contentId;

    private Integer articleInfoId;
    private String content;

    public ArticleContent() {
    }

    public ArticleContent(Integer articleInfoId, String content) {
        this.articleInfoId = articleInfoId;
        this.content = content;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(Integer articleInfoId) {
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
