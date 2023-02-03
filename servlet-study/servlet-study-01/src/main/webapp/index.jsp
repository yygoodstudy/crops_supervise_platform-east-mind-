<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%><%--使用JSP EL表达式--%>
<html>
<body>
<h2>欢迎登陆</h2>

<form action="/login" method="post">
    username:<input type="text" name="username" value=""><br>
    password:<input type="password" name="password" value=""><span style="color: red">${requestScope.errorMessage}</span><br>
    <button type="submit" value="登录">登录</button>
</form>
</body>
</html>
