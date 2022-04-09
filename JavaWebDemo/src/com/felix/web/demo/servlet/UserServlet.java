package com.felix.web.demo.servlet;

import com.felix.web.demo.dao.UserDAO;
import com.felix.web.demo.dao.impl.UserDAOImpl;
import com.felix.web.demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/10
 * Time: 12:57
 */
@WebServlet(name = "user", urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");

        UserDAO userdao = new UserDAOImpl();
        User user = userdao.getUserById(userid);

        if(user != null) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("page/userinfo.jsp").forward(request, response);
        }

    }
}
