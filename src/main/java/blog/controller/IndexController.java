package blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "blog";
    }

    @RequestMapping("/specificBlog")
    public String specificBlog(){
        return "specificBlog";
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-12 11:12
 **/
