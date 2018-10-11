<%--
  Created by IntelliJ IDEA.
  User: dainy33
  Date: 10/11/18
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h3>登录页面</h3>
<form action="/userController/login" method="post">
    <table>
        <tr>
            <td><label>用户名:</label></td>
            <td><input type="text" name="username" id="username"></td>
        </tr>
        <tr>
            <td><label>密&nbsp&nbsp&nbsp&nbsp码:</label></td>
            <td><input type="password" name="password" id="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" id="submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
