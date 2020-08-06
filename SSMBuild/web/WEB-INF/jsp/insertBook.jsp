<%--
  Created by IntelliJ IDEA.
  User: Puffs
  Date: 2020/08/06
  Time: 05:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css"
          integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">

</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/insertBook" method="post">
        <div class="form-group">
            <label>书籍名称：</label>
            <label>
                <input type="text" name="bookName" class="form-control">
            </label>
        </div>
        <div class="form-group">
            <label>书籍数量：</label>
            <label>
                <input type="text" name="bookCount" class="form-control">
            </label>
        </div>
        <div class="form-group">
            <label>书籍描述：</label>
            <label>
                <input type="text" name="detail" class="form-control">
            </label>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>
</div>
</body>
</html>
