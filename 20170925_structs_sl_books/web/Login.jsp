<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/12
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function login(){
            targetForm =document.forms[0];
            targetForm.action="loginAction!loginMethod";
            targetForm.submit();
        }

        function regist(){
            targetForm =document.forms[0];
            targetForm.action="registAction!registMethod";
            targetForm.submit();
        }


    </script>


</head>
<body>
<font color="red"></font>${requestScope.error}
<font color="red"> <s:fielderror></s:fielderror></font>
<s:property value="info"></s:property>
<form action="action!methodName" method="post">
    <table cellspacing="20" align="center">
        <tr>

            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>

            <td>密 码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>

            <td>验证码：</td>
            <td><input type="text" name="code">&nbsp;
                <img src="code.action" onclick="this.src='code.action'"></td>
        </tr>

        <tr>

            <td>用户类型</td>
            <td>
                <select name="type"  >
                    <option value="管理员" name="管理员">管理员</option>
                    <option value="普通用户"name="普通用户">普通用户</option>
                </select>

            </td>
        </tr>
        <tr align="center">
            <td colspan="3">
                <input type="button" value="登陆" onclick="login()">
                <input type="button" value="注册" onclick="regist()">

            </td>

        </tr>
    </table>
</form>

</body>
</html>
