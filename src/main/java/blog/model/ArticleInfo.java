package blog.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table
public class ArticleInfo implements Serializable {

    @Id
    @Column
    private String articleInfoId;

    private String title;
    private String type;
    private String author;

    private String createBy;
    private Date createDate;
    private String updateBy;
    private Date updateDate;
    private String version;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:38
 **/
