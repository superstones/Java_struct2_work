<%--
  Created by IntelliJ IDEA.
  User: idea
  Date: 2017/10/23
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
    <s:form action="uploadAction" method="POST" enctype="multipart/form-data">
        <%--单文件上传--%>
        <s:textfield label="主题" name="title"></s:textfield>
        <%--<s:file label="选择文件" name="upload"></s:file>--%>
        <%--多文件上传--%>
        <s:file label="选择文件1" name="upload"></s:file>
        <s:file label="选择文件2" name="upload"></s:file>
        <s:file label="选择文件3" name="upload"></s:file>
        <s:submit value="上传"></s:submit>
    </s:form>
</body>
</html>