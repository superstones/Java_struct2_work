<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/11
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
注册成功，用户名为${sessionScope.user.username}<br>
电话号是：${sessionScope.user.tel}<br>
详细地址是:<br>
${sessionScope.user.address}


<a href="login.jsp">登陆</a>
</body>
</html>
