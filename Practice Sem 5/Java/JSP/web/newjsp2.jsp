<%-- 
    Document   : newjsp2
    Created on : 6 Oct, 2023, 6:21:47 PM
    Author     : Kalpesh
--%>

<%@page  isErrorPage="true" %> 
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu.jsp" %>
        <h1>Hello World!</h1>
        <!-- Create variable with scriptlet tag -->
        <% int year = 2023; %>
        
        <!-- print year with expression tag -->
        <h1>Welcome to <%= year %></h1>
        
        <jsp:forward page="newjsp1.jsp" />
    </body>
</html>
