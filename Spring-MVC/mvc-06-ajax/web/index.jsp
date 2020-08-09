<%--
  Created by IntelliJ IDEA.
  User: Puffs
  Date: 2020/08/07
  Time: 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
  <script>
    function o() {
      $.post({
        url: "${pageContext.request.contextPath}/a1",
        data: {"name": $("#username").val()},
        success: function (data, status) {
          console.log("data = " + data);
          console.log("status = " + status);
          alert(data);
        }
      })
    }
  </script>
</head>
<body>

用户名：<input type="text" id="username" onblur="o()">
</body>
</html>
