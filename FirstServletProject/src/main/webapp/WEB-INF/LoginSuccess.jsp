<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 11-10-2022
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h3>Hi<%=request.getAttribute("user")%>, Login Successful.</h3>
<a href="login.html">Login Page</a>
</body>
</html>
