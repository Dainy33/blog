package blog.controller;

import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.service.IArticleService;
import blog.utils.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/articleController")
public class ArticleController {

    @Resource
    IArticleService iArticleService;


    @RequestMapping(value = "/writing",method = RequestMethod.POST)
    public String write(HttpServletRequest request, HttpServletResponse response){

        ArticleInfo articleInfo =new ArticleInfo();
        ArticleContent articleContent = new ArticleContent();

        articleInfo.setTitle(request.getParameter("title"));
        articleInfo.setAuthor(request.getParameter("author"));
        articleInfo.setDescription(request.getParameter("description"));

        String infoId = iArticleService.createArticleInfo(articleInfo);

        articleContent.setArticleInfoId(infoId);
        articleContent.setContent(request.getParameter("content"));

        iArticleService.createArticleContent(articleContent);

        return "blog";
    }

    @RequestMapping(value = "createArticleComment",method = RequestMethod.POST)
    public String createArticleComment(HttpServletRequest request, HttpServletResponse response){

        ArticleComment articleComment = new ArticleComment();

        articleComment.setArticleInfoId(request.getParameter("infoId"));
        articleComment.setName(request.getParameter("name"));
        articleComment.setEmail(request.getParameter("email"));
        articleComment.setComment(request.getParameter("message"));

        iArticleService.createArticleComment(articleComment);
        return "index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(HttpServletRequest request, HttpServletResponse response,ArticleInfo articleInfo){

        String infoId = articleInfo.getArticleInfoId();
        iArticleService.deleteArticleInfoByInfoId(infoId);
        iArticleService.deleteArticleContent(infoId);
        iArticleService.deleteArticleComment(infoId);

        return "common/success";
    }

    //返回最新的N篇文章 N=10
    @RequestMapping(value = "/getLatestTenArticleInfo",method = RequestMethod.GET)
    @ResponseBody
    public String getLatestTenArticleInfo(HttpServletRequest request, HttpServletResponse response){
        List<ArticleInfo> latestTenArticleInfo = iArticleService.getLatestTenArticleInfo();
        String responseInfo = JsonUtil.beanToJson(latestTenArticleInfo);
        return responseInfo;
    }

    @RequestMapping(value = "/getArticleInfoByInfoId",method = RequestMethod.GET)
    @ResponseBody
    public String getArticleInfoByInfoId(HttpServletRequest request, HttpServletResponse response,@RequestParam String infoId){

        ArticleInfo articleInfo = iArticleService.getArticleInfoByInfoId(infoId);
        String responseInfo = JsonUtil.beanToJson(articleInfo);
        responseInfo = "["+responseInfo+"]";
        return responseInfo;
    }

    @RequestMapping(value = "/getArticleContentByInfoId",method = RequestMethod.GET)
    @ResponseBody
    public String getArticleContentByInfoId(HttpServletRequest request, HttpServletResponse response,@RequestParam String infoId){

        ArticleContent articleContent = iArticleService.getArticleContentByInfoId(infoId);
        String responseInfo = JsonUtil.beanToJson(articleContent);
        responseInfo = "["+responseInfo+"]";
        return responseInfo;
    }

    @RequestMapping(value = "/getArticleCommentByInfoId",method = RequestMethod.GET)
    @ResponseBody
    public String getArticleCommentByInfoId(HttpServletRequest request, HttpServletResponse response,@RequestParam String infoId){

        List<ArticleComment> commentList = iArticleService.getArticleCommentByInfoId(infoId);
        String responseInfo = JsonUtil.beanToJson(commentList);
        return responseInfo;
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 17:20
 **/
