<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/23
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <s:form action="UploadAction" method="post" enctype="multipart/form-data">
       <s:textfield label="文件主题" name="title"></s:textfield>
       <s:file label="选择文件1" name="upload"></s:file>
       <s:file label="选择文件2" name="upload"></s:file>
       <s:file label="选择文件3" name="upload"></s:file>


       <s:submit name="上传" value="上传"></s:submit>

   </s:form>


</body>
</html>
