<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/16
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 用户${sessionScope.user.username}的电话号码是:
${sessionScope.user.tel}<br>
 详细地址是:<br>
${sessionScope.user.address}

</body>
</html>
