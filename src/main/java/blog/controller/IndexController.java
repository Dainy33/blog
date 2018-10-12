package blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/single")
    public String about(){
        return "single";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-12 11:12
 **/
