package com.firstservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
       // super.doGet(req, resp);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello World Swayam My First Servlet!</h3>");
        out.close();
    }
}
