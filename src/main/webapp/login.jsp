<%@ page import="java.util.Objects" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: emicampbell
  Date: 3/8/23
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link href="css/login.css" rel="stylesheet">
</head>
<%
    if (request.getParameter("username") != null && request.getParameter("username").equals("admin") && request.getParameter("password") != null && request.getParameter("password").equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>
<body>
<%@ include file="partials/navbar.jsp" %>
<%@ include file="partials/head.jsp" %>
<div style="text-align: center;"><h1> Student Login Form </h1></div>
<form action="login.jsp" method="post">
    <div class="container">
        <label>Username: </label>
        <input type="text" placeholder="Enter Username" name="username" required>
        <label>Password: </label>
        <input type="password" placeholder="Enter Password" name="password" required>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
