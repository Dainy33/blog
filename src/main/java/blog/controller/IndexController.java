package blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    @RequestMapping(value = "/writing")
    public String write(HttpServletRequest request, HttpServletResponse response){
        return "writing";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "login";
    }

    @RequestMapping(value = "/contact")
    public String contact(HttpServletRequest request, HttpServletResponse response){
        return "contact";
    }

    @RequestMapping(value = "/blog")
    public String blog(HttpServletRequest request, HttpServletResponse response){
        return "blog";
    }

    @RequestMapping(value = "/specificBlog")
    public String specificBlog(HttpServletRequest request, HttpServletResponse response, @RequestParam String infoId){
        //infoId怎么给specificBlog视图
        request.setAttribute("infoId",infoId);
        return "specificBlog";
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-12 11:12
 **/
