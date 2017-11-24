<%--
  Created by IntelliJ IDEA.
  User: lizhongren1
  Date: 2017/5/8
  Time: 上午10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

    <link rel="stylesheet" href="../../bs/css/bootstrap.css">
    <script src="../../js/jquery-3.2.1.min.js"></script>
    <script src="../../bs/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<div class="container col-md-4 col-md-offset-4">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">
                注册
            </h3>
        </div>
        <div class="panel-body">
            <form>
                <div class="form-group">
                    <label for="regname">用户名</label>
                    <input type="text" class="form-control" id="regname" placeholder="请输入用户名">
                </div>
                <div class="form-group">
                    <label for="regpass">密码</label>
                    <input type="password" class="form-control" id="regpass" placeholder="请输入密码">
                </div>
                <div class="form-group">
                    <label for="regpassre">重复密码</label>
                    <input type="password" class="form-control" id="regpassre" placeholder="请再次输入密码">
                </div>
                <div class="form-group">
                    <label for="regtel">电话</label>
                    <input type="text" class="form-control" id="regtel" placeholder="请输入常用电话">
                </div>
                <div class="form-group">
                    <label for="regaddress">地址</label>
                    <input type="text" class="form-control" id="regaddress" placeholder="请输入常用地址">
                </div>
                <button type="button" class="btn btn-default" id="submitbtn">提交注册</button>
            </form>
        </div>
    </div>
</div>

</body>

<script src="../../js/jquery-3.2.1.min.js"></script>
<script src="../../js/regpage.js"></script>

</html>
