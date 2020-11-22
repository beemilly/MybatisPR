<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<form action="regUser">
	<!-- 회원ID 중복체크는 나중에 a-jax 또는 select문을 먼저 실행 후 insert를 실행하는 방법으로 해볼 것 -->
	Id : <input type="text" name="id"><br>
	Password : <input type="password" name="password"><br>
	이름 : <input type="text" name="name"><br>
	나이 : <input type="number" name="age"><br>
	<input type="submit" value="회원가입">

</form>

</body>
</html>