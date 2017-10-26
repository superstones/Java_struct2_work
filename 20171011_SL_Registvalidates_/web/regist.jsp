<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head><sx:head></sx:head></head>
<body>
<s:fielderror fieldName="error"> </s:fielderror>
<s:form action="registAction" method="post" enctype="multipart/form-data">
    <tr>
        <td><s:textfield label="用户名" name="username"> </s:textfield></td>
    </tr>

    <tr>
        <td><s:password label="登陆密码" name="password"> </s:password></td>
    </tr>
    <tr>
        <td><s:password label="确认密码" name="rPassword"> </s:password></td>
    </tr>

    <tr>
        <td><s:textfield label="姓名" name="realName"> </s:textfield></td>
    </tr>

    <tr>
        <td><s:textfield label="手机号码" name="telephone"> </s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="固定电话" name="tel"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="省" name="address"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="市" name="address"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="区" name="address"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="街道" name="address"></s:textfield></td>
    </tr>
    <tr>
        <td><s:textfield label="Email地址" name="emailAddress"> </s:textfield></td>
    </tr>
    <tr>
        <s:file label="个人照片" name="upload"></s:file></tr>


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
