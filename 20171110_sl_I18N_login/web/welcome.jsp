<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:i18n name="Login">
<html>
<head>
    <title>$Title$</title>
</head>
<body><jsp:useBean id="d" class="java.util.Date" scope="page"/>
<s:text name="welcome.msg">
    <s:param><s:property value="username" /></s:param>
    <s:param>${d}</s:param>
</s:text>

</body>
</html>
</s:i18n>