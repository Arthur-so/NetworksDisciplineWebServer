package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DynamicServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>Conteúdo Dinâmico com Java Servlet</h1>");
        writer.println("<p>IP: " + req.getRemoteAddr() + "</p>");
        writer.println("<p>Data: " + new java.util.Date() + "</p>");
        writer.println("</body></html>");
    }
}
