<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h3>注册页面</h3>
<br>
<form action="/userController/register" method="post">
    <table>
        <tr>
            <td><label>用户名:</label></td>
            <td><input type="text" name="username" id="username"></td>
        </tr>
        <tr>
            <td><label>密&nbsp&nbsp&nbsp&nbsp码:</label></td>
            <td><input type="password" name="password1" id="password1"></td>
        </tr>
        <tr>
            <td><label>重&nbsp&nbsp&nbsp&nbsp复:</label></td>
            <td><input type="password" name="password2" id="password2"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册" id="submit"></td>
        </tr>
    </table>
</form>

</body>
</html>
