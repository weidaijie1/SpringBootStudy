<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <table class="table">
        <tr>
            <td>姓名</td>
            <td>生日</td>
            <td>性别</td>
            <td>地址</td>
        </tr>

        <#list userList as user>
            <tr>
                <td>${user.user_name}</td>
                <td>${user.birthday}</td>
                <td>${user.sex}</td>
                <td>${user.address}</td>
            </tr>
        </#list>
    </table>
</div>

<script src="/webjars/jquery/jquery.min.js "></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>