package blog.controller;

import blog.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/userController")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        return "user/loginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        boolean result = iUserService.ensureUser(username,password);
        if(result){
            return "user/success";
        }
        return "user/error";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "user/registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username, @RequestParam("password1") String password1, @RequestParam("password2") String password2) {
        boolean result = iUserService.createUser(username, password1, password2);
        if(result){
            return "user/success";
        }
        return "user/error";
    }


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-11 09:33
 **/
