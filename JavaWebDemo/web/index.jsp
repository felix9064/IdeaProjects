<%--
  Created by IntelliJ IDEA.
  User: Felix
  Date: 2017/3/9
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String userst = (String) request.getAttribute("userst");
%>
<html>
  <head>
    <title>柜面系统常用功能</title>
  </head>
  <body>
  你好哇！${userst}!
  </body>
</html>
