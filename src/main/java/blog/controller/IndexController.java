package blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    @RequestMapping("/about")
    public String about(HttpServletRequest request, HttpServletResponse response){
        return "about";
    }

    @RequestMapping("/contact")
    public String contact(HttpServletRequest request, HttpServletResponse response){
        return "contact";
    }

    @RequestMapping("/blog")
    public String blog(HttpServletRequest request, HttpServletResponse response){
        return "blog";
    }

    @RequestMapping("/specificBlog")
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
