<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<form action="loginCheck">

	Id : <input type="text" name="id"><br>
	Password : <input type="password" name="password"><br>
	<input type="submit" value="로그인">

</form>
<a href="moveRegUser">회원가입</a>

</body>
</html>
