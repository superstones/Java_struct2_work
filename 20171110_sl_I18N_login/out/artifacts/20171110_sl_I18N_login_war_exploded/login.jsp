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
    <s:text name="type"></s:text><select name="type">
    <option><s:text name="admin"></s:text></option>
    <option><s:text name="User2"></s:text></option>
</select>
    <s:submit key="submit"/>
</s:form>
<a href="LoginAction?request_locale=zh_CN"><s:text name="language.zh"/></a>
<a href="LoginAction?request_locale=en_US"><s:text name="language.en"/></a>

<%--<a href="LoginAction?request_locale=zh_CN" onclick="selectLanguage()" id="language"><s:text name="language"/></a>--%>

<%--<script>--%>
    <%--function selectLanguage() {--%>
        <%--var language = document.getElementById("language");--%>
        <%--var text = language.href;--%>
        <%--if (text === "LoginAction?request_locale=en_US") {--%>
            <%--href = "LoginAction?request_locale=zh_CN";--%>
<%--//            console.log(href);--%>
            <%--language.submit()--%>
        <%--}else {--%>
            <%--href = "LoginAction?request_locale=en_US";--%>
<%--//            console.log(href);--%>
<%--//            language.submit()--%>
            <%--language.onclick--%>
        <%--}--%>

    <%--}--%>


<%--</script>--%>
</body>
</html>
