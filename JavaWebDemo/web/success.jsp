<%@ page import="com.felix.web.demo.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Felix
  Date: 2017/3/10
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作成功</title>
</head>
<body>
    <%
        User user = (User) request.getAttribute("user");
    %>

    <h3>你好：<%=user.getUserna() %> </h3>
</body>
</html>
