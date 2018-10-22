package blog.controller;

import blog.model.ArticleComment;
import blog.model.ArticleContent;
import blog.model.ArticleInfo;
import blog.service.IArticleService;
import blog.utils.useless.ResponseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Resource
    IArticleService iArticleService;

    //http://localhost:8080/test/createInfoTest
    @RequestMapping(value = "/createInfoTest")
    @ResponseBody
    public String createInfoTest() {
        ArticleInfo articleInfo = new ArticleInfo(UUID.randomUUID().toString(),"First test article", "Test", "Dainy");
        articleInfo.setDescription("描述信息123456");
        iArticleService.createArticleInfo(articleInfo);
        return "Banana!";
    }

    //http://localhost:8080/test/createContentTest
    @RequestMapping(value = "/createContentTest")
    @ResponseBody
    public String createContentTest(){
        ArticleContent articleContent = new ArticleContent(UUID.randomUUID().toString(),UUID.randomUUID().toString(),"一花一树一世界!");
        iArticleService.createArticleContent(articleContent);
        return "Banana!";
    }
    //http://localhost:8080/test/createCommentTest
    @RequestMapping(value = "/createCommentTest")
    @ResponseBody
    public String createCommentTest(){
        ArticleComment articleComment = new ArticleComment(UUID.randomUUID().toString(),UUID.randomUUID().toString(),"月落乌啼霜满天!");
        iArticleService.createArticleComment(articleComment);
        return "Banana!";
    }

    //http://localhost:8080/test/getCommentByIdTest
    @RequestMapping(value = "/getCommentByIdTest")
    @ResponseBody
    public ResponseInfo getCommentByIdTest(){
        ResponseInfo responseInfo = ResponseInfo.createFailedResponse("");

        List<ArticleComment> articleCommentList = iArticleService.getArticleCommentByInfoId("1");

        responseInfo = ResponseInfo.createQueryListResponse(articleCommentList,10,"5","5");
        return responseInfo;
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 14:34
 **/
