<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="baseUrl" value="#{pageContext.request.contextPath}"/>
<html>
<head>
    <title>登录页面</title>

</head>
<body>
<h1>登录</h1>
<form action="${baseUrl}/user/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
