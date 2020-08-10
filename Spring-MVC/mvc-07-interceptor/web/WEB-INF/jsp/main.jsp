<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <c:set var="baseUrl" value="${pageContext.request.contextPath}"/>
</head>
<body>
<h1>首页</h1>
<span>${username}</span>
<p>
    <a href="${baseUrl}/user/goOut">注销</a>
</p>
</body>
</html>
