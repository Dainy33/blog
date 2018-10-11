<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
    <title>成功</title>
    <script src="<%=contextPath%>static/jquery-3.1.1.js"></script>
    <script src="<%=contextPath%>static/bootstrap/js/bootstrap.js"></script>
    <link href="<%=contextPath%>static/bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="<%=contextPath%>static/bootstrap/css/bootstrap-theme.css" rel="stylesheet"/>
</head>
<body>
<jsp:include page="top.jsp"/>
<div>
    <h3>成功</h3>
</div>
</body>
</html>
