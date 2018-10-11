<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>

<div id="container" >
    <div id="header" style="background-color:cadetblue;height: 10%;text-align: center">
        <h1 style="margin-bottom: 0px">王柄楠的个人博客</h1>
    </div>
    <div id="menu" style="width: 30%;height: 87%;float: left;">
        <b>菜单</b><br>
        <a href="articleController/write">这是一个假的写博客链接</a><br>
        <a href="userController/login" style="text-decoration-line: none">这是一个打开登录页面的链接</a><br>
        <a href="userController/register">这是一个打开注册页面的链接</a><br>
        <a href="articleController/getLatestTenArticleInfo">点我获得技术文章</a><br>
    </div>
    <div id="content" style="width: 70%;height: 87%;float: left;">
        这里以后会展示10篇文章
    </div>
    <div id="bottom" style="background-color: cadetblue;height: 3%;clear:both;text-align:center;">
        版权 © Dainy33
    </div>

</div>
</body>
</html>
