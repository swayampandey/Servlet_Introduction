package com.firstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Login Servlet Testing",urlPatterns = {"/LoginServlet"}, initParams = {
        @WebInitParam(name = "user", value = "Swayam"), @WebInitParam(name = "password", value = "12345")})

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // super.doGet(req, resp);
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        String userId = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");
        if(userId.equals(user) && password.equals(pwd)){
            request.setAttribute("user", user);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font colour=red> Either user name or password is wrong</font>");
            rd.include(request,response);
        }
    }
}
