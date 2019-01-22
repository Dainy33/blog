package blog.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class HelloWorldServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        config.getInitParameter("");
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-18 15:12
 **/
