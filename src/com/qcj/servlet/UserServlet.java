package com.qcj.servlet;

import com.qcj.service.UserService;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * spring 整合 web
 */
@WebServlet(value = "/delete")
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String id = request.getParameter("id");

        //通过域得到userService对象
        WebApplicationContext wac = (WebApplicationContext)getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        UserService userService = wac.getBean("userService",UserService.class);//得到userService对象

        userService.deleteUser(Integer.parseInt(id));
        response.getWriter().println("success");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
