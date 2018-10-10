package blog.controller;

import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.service.IArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

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
        return "views/writeSuccess";
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 17:20
 **/
