<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
</head>
<body>

<form action="deleteUserInfo">
	<!-- Id는 나중에 세션을 활용하여 로그인한 아이디값이 들어가도록 해볼 것 -->
	Id : <input type="text" name="id"><br>
	Password : <input type="password" name="password"><br>
	<input type="submit" value="회원탈퇴">

</form>

</body>
</html>