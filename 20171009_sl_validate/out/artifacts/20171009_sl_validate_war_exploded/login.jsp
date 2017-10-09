<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:fielderror fieldName="error"> </s:fielderror>
<s:form action="LoginAction"  method="post">
    <s:textfield label="用户名" name="username"> </s:textfield>
    <s:password label="密码" name="password" > </s:password>
     <s:submit value="登陆" > </s:submit>

</s:form>
</body>
</html>
