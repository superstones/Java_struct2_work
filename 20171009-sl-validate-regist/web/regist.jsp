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
<s:form action="LoginAction" method="post">
    <tr>
        <td><s:textfield label="Email地址" name="emailAddress"> </s:textfield></td>
    </tr>
    <tr>
        <td><s:password label="登陆密码" name="password"> </s:password></td>
    </tr>
    <tr>
        <td><s:password label="确认密码" name="passwordtwo"> </s:password></td>
    </tr>
    <tr>
        <td><s:textfield label="登录名（昵称）" name="username"> </s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="真实姓名" name="name"> </s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="手机号码" name="telephone"> </s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="验证码" name="code"> </s:textfield></td>
        <td><img src="code.action" onclick="this.src='code.action'"></td>
    </tr>
    <tr>
        <td><s:submit value="注册"> </s:submit></td>
    </tr>

</s:form>
</body>
</html>
