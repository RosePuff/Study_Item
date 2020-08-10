<%--
  Created by IntelliJ IDEA.
  User: Puffs
  Date: 2020/08/09
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="baseUrl" value="${pageContext.request.contextPath}/"/>
<html>
<head>
    <title>登录</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
    <script>
        function username() {
            $.post({
                url: "${baseUrl}a3",
                data: {"name": $("#name").val()},
                success: function (data) {
                    console.log(data.toString());
                    if (data.toString() === 'OK') {
                        $("#userInfo").css("color", "green");
                    } else {
                        $("#userInfo").css("color", "red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }

        function password() {
            $.post({
                url: "${baseUrl}a3",
                data: {"password": $("#password").val()},
                success: function (data) {
                    console.log(data.toString());
                    if (data.toString() === 'OK') {
                        $("#passwordInfo").css("color", "green");
                    } else {
                        $("#passwordInfo").css("color", "red");
                    }
                    $("#passwordInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>

<p>
    用户名：<input type="text" id="name" onblur="username()">
    <span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" id="password" onblur="password()">
    <span id="passwordInfo"></span>
</p>

</body>
</html>

