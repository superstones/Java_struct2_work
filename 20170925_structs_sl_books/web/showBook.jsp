
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/27
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr bgcolor="blue">
        <td>书名</td>
        <td>作者</td>
        <td>定价</td>
    </tr>
    <s:iterator value="books" var="b">
    <tr>

        <td><s:property value="#b.bookName"/></td>
        <td><s:property value="#b.bookAuthor"/></td>
        <td><s:property value="#b.bookPrice"/></td>




    </tr>
    </s:iterator>

</table>

</body>
</html>
