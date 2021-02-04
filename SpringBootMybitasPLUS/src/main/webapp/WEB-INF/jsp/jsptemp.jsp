<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<table class="table">
    <tr>
        <td>姓名</td>
        <td>生日</td>
        <td>性别</td>
        <td>地址</td>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr class="text-info">
            <td>${user.user_name}</td>
            <td>${user.birthday}</td>
            <td>${user.sex}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>


</table>
<img src="/image/jsp.png">
<%--<h1>测试111111</h1>--%>
<script src="/webjars/jquery/jquery.min.js "></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>