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
        data: {"name": $("username").val()},
        success: function (data) {
          alert(data);
        }
      })
    }
  </script>
</head>
<body>

<label for="username">用户名：
  <input type="text" id="username" onblur="o()">
</label>
</body>
</html>
