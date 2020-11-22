<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>

<form action="modifyUserInfo">
	<!-- Id는 나중에 세션을 활용하여 로그인한 아이디값이 들어가도록 해볼 것 -->
	Id : <input type="text" name="id"><br>
	Password : <input type="password" name="password"><br>
	이름 : <input type="text" name="name"><br>
	나이 : <input type="number" name="age"><br>
	<input type="submit" value="회원정보 수정">

</form>

</body>
</html>