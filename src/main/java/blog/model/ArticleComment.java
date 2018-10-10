package blog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table
public class ArticleComment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer commentId;

    private Integer articleInfoId;
    private String comment;

    public ArticleComment() {
    }

    public ArticleComment(Integer articleInfoId, String comment) {
        this.articleInfoId = articleInfoId;
        this.comment = comment;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(Integer articleInfoId) {
        this.articleInfoId = articleInfoId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:40
 **/
