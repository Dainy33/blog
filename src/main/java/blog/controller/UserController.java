package blog.controller;

import blog.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private IUserService iUserService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, @RequestParam("username") String username, @RequestParam("password") String password) {
        boolean result = iUserService.ensureUser(username,password);
        if(result){
            request.getSession().setAttribute("username",username);
            return "redirect:/writing";
        }
        return "redirect:/login";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "user/registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username, @RequestParam("password1") String password1, @RequestParam("password2") String password2) {
        boolean result = iUserService.createUser(username, password1, password2);

        return (result=true)?"success":"error";
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-11 09:33
 **/
