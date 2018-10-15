package blog.controller;

import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.service.IArticleService;
import blog.utils.ResponseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/articleController")
public class ArticleController {

    @Resource
    IArticleService iArticleService;

    @RequestMapping(value = "/write",method = RequestMethod.POST)
    public String write(ArticleInfo articleInfo, ArticleContent articleContent){

        String articleInfoId = iArticleService.createArticleInfo(articleInfo);
        articleContent.setArticleInfoId(articleInfoId);
        iArticleService.createArticleContent(articleContent);

        return "common/success";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String delete(ArticleInfo articleInfo){

        String infoId = articleInfo.getArticleInfoId();
        iArticleService.deleteArticleInfoByInfoId(infoId);
        iArticleService.deleteArticleContent(infoId);
        iArticleService.deleteArticleComment(infoId);

        return "common/success";
    }

    //返回最新的N篇文章 N=10
    @RequestMapping(value = "getLatestTenArticleInfo",method = RequestMethod.GET)
    @ResponseBody
    public ResponseInfo getLatestTenArticleInfo(Model model){
        List<ArticleInfo> latestTenArticleInfo = iArticleService.getLatestTenArticleInfo();
        ResponseInfo responseInfo = ResponseInfo.createQueryListResponse(latestTenArticleInfo,10,"10","10");
        return responseInfo;
    }

}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 17:20
 **/
