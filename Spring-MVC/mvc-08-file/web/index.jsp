<%--
  Created by IntelliJ IDEA.
  User: Puffs
  Date: 2020/08/11
  Time: 03:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
  <input type="file" name="file"/>
  <input type="submit" value="upload">
</form>

<a href="/download">点击下载</a>

</body>
</html>
