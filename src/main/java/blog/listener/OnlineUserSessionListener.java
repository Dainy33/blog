package blog.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineUserSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {

        Integer users =  (Integer) se.getSession().getServletContext().getAttribute("TOTAL_ONLINE_USERS");

        if(users==null){
            users = 0;
        }

        users += 1;

        se.getSession().getServletContext().setAttribute("TOTAL_ONLINE_USERS",users);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Integer users =  (Integer) se.getSession().getServletContext().getAttribute("TOTAL_ONLINE_USERS");

        users -= 1;

        se.getSession().getServletContext().setAttribute("TOTAL_ONLINE_USERS",users);
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-22 18:37
 **/
