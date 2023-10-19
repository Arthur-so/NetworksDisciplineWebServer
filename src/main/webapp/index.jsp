<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Página inicial JSP</title>
</head>
<body>
    <h1>Para conteúdo dinâmico com JSP e Servlets:</h1>
    <%
        String domain = request.getServerName(); // Obtém o domínio atual
        int port = request.getServerPort(); // Obtém a porta do servidor
        String contextPath = request.getContextPath(); // Obtém o caminho do contexto da aplicação
    %>
    <a href="http://<%= domain %>:<%= port %><%= contextPath %>/DynamicServlet">Dynamic Servlet</a>
</body>
</html>
