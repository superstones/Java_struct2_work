<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/11
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆成功</title>
  </head>
  <body>


  欢迎${sessionScope.type}${sessionScope.user}登陆<br>
  <hr>

  <a href="AddBook.jsp" target="main">增加书籍</a>
  <a href="deleteAction">删除书籍</a>
  <a href="modifyAction">修改书籍</a>
  <a href="queryAction">查询书籍</a>
<iframe name="main"width="680"height="400">




</iframe>

  </form>
  </body>
</html>
