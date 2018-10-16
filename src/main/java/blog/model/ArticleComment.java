package blog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "articleComment")
public class ArticleComment implements Serializable {

    //@GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    @Column
    private String commentId;

    private String articleInfoId;

    @Column(columnDefinition="TEXT", nullable=true)
    private String comment;

    private Date createDate;


    public ArticleComment() {
    }

    public ArticleComment(String  commentId, String  articleInfoId, String comment) {
        this.commentId = commentId;
        this.articleInfoId = articleInfoId;
        this.comment = comment;
    }

    public String  getCommentId() {
        return commentId;
    }

    public void setCommentId(String  commentId) {
        this.commentId = commentId;
    }

    public String  getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(String  articleInfoId) {
        this.articleInfoId = articleInfoId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:40
 **/
