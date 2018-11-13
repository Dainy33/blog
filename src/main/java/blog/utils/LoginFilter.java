package blog.utils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;
        HttpSession session = request.getSession();

        //从session中获取SessionKey对应值,若值不存在,则重定向到redirectUrl
        Object user = session.getAttribute("username");
        if(user==null){
            response.sendRedirect(request.getContextPath()+"/login");
            return;
        }

        //若存在,则放行
        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-11-13 09:40
 **/
