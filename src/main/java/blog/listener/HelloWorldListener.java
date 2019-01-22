package blog.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloWorldListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();

        String sayWhat = servletContext.getInitParameter("SayWhat");

        System.out.println(sayWhat);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2019-01-18 11:25
 **/
