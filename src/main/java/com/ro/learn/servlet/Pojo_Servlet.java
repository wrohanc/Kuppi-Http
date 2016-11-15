package com.ro.learn.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by rohan on 2016-11-11.
 */
@WebServlet(urlPatterns = { "/Pojo_Servlet" })
public class Pojo_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String order = request.getHeader("order");
        //InputStreamReader reader = new InputStreamReader(request.getInputStream());

        System.out.println("POJO Servlet Order new message received :" + order);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Order response</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>{\"orderId\" : 1, \"status\" : \"Queued\"}</h1>");

            out.println("</body>");
            out.println("</html>");

            out.flush();
        }
    }
}
