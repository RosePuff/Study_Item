<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="baseUrl" value="${pageContext.request.contextPath}"/>
<html>
<head>
  <title>主页</title>
</head>
<body>
<h1><a href="${baseUrl}/user/goLogin">登录页面</a></h1>
<h1><a href="${baseUrl}/user/main">首页</a></h1>
</body>
</html>