package blog.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "articleInfo")
public class ArticleInfo implements Serializable {

    @Id
    @Column
    private String articleInfoId;
    private String createDate;

    private String title;
    private String author;

    @Column(columnDefinition="TEXT", nullable=true)
    private String description;

    //暂时不需要默认为null即可
    private String type;
    private Boolean isDeleted;
    private Boolean isTop;
    private Boolean isOriginal;
    private Boolean isPrivate;

    public ArticleInfo() {
    }

    public ArticleInfo(String articleInfoId, String title, String type, String author) {
        this.articleInfoId = articleInfoId;
        this.title = title;
        this.type = type;
        this.author = author;
    }

    public String getArticleInfoId() {
        return articleInfoId;
    }

    public void setArticleInfoId(String articleInfoId) {
        this.articleInfoId = articleInfoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String  getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Boolean getOriginal() {
        return isOriginal;
    }

    public void setOriginal(Boolean original) {
        isOriginal = original;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
 * @create: 2018-10-10 11:38
 **/
