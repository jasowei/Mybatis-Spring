<%--
  Created by IntelliJ IDEA.
  User: lizhongren1
  Date: 2017/5/17
  Time: 上午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改博客</title>
    <link rel="stylesheet" href="../../bs/css/bootstrap.css">
    <script src="../../js/jquery-3.2.1.min.js"></script>
    <script src="../../bs/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<div class="container">
    <h1>
        更新博客
    </h1>
<table class="table">
    <tr>
        <td>标题</td>
        <td><input class="form-control" type="text" id="add_title" required></td>
    </tr>
    <tr>
        <td>描述</td>
        <td><textarea class="form-control" id="add_des" placeholder="请简要描述一下博客内容" required></textarea></td>
    </tr>
    <tr>
        <td>内容</td>
        <td><textarea class="form-control" rows="10" id="add_content" placeholder="请输入内容" required></textarea></td>
    </tr>
</table>
    </div>
<div class="text-center">
<button id="subtn" class="btn btn-primary">提交</button>
<button id="back" class="btn btn-default">返回</button>
</div>
</body>

<script src="../../js/jquery-3.2.1.min.js"></script>
<script src="../../js/jquery.cookie.js"></script>
<script>

    $("#subtn").click(function () {

        $.post("/newblog",{
            "title":$("#add_title").val(),
            "des":$("#add_des").val(),
            "context":$("#add_content").val(),
            "userid":$.cookie("userid")
        },function (result) {
            if (result.errorCode == 0) {
                alert(result.message)
                location.href = "/blogpage/"+$.cookie("userid")
            }
        })
    })

    $("#back").click(function () {
        location.href = "/pages/blog/blogpage.jsp"
    })
</script>

</html>
