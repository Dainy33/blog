package blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "blogComment")
public class BlogComment implements Serializable {

    //@GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    @Column
    private String commentId;


    @Column(columnDefinition="TEXT", nullable=true)
    private String comment;

    private String name;
    private String email;

    private String createDate;


    public BlogComment() {
    }

    public BlogComment(String  commentId, String comment) {
        this.commentId = commentId;
        this.comment = comment;
    }

    public String  getCommentId() {
        return commentId;
    }

    public void setCommentId(String  commentId) {
        this.commentId = commentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:40
 **/
