<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<h1>这不是一句话，这其实是页眉</h1>
<%--
<a href="WEB-INF/views/writeSuccess.jsp">写博客</a>
--%>
<a href="articleController/write">这是一个假的写博客链接</a>
<a href="articleController/createInfoTest">这也是一个假的写博客链接</a>
<a href="userController/login">这是一个打开登录页面的链接</a>
<a href="userController/register">这是一个打开注册页面的链接</a>

</body>
</html>
