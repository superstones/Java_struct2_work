<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/11
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<s:include value="SelectLanguage.jsp"/>
<html>
<head>
    <title><s:text name="title"/></title>
    <s:head/>
</head>
<body>


<s:form action="LoginAction" method="POST">
    <s:textfield name="username" key="user"/>
    <s:password name="password" key="pass"/>
    <s:text name="type"/><select name="type">
    <option><s:text name="admin"/></option>
    <option><s:text name="User2"/></option>
</select>
    <s:submit key="submit"/>
</s:form>
<a href="LoginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
<a href="LoginAction?request_locale=en_US"><s:text name="language.en"/></a>

</body>
</html>
