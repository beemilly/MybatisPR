<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전 회원 정보</title>
</head>
<body>

<table border="1">

	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>나이</th>
		<th>가입일</th>
	</tr>
	<c:forEach items="${userInfoList}" var="list">
	<tr>
		<td>${list.id}</td>
		<td>${list.name}</td>
		<td>${list.age}</td>
		<td>${list.reg_date}</td>
	</tr>
	</c:forEach>

</table>
<a href="moveModifyUserInfo">회원정보 수정</a><br>
<a href="moveDeleteUserInfo">회원탈퇴</a><br>
</body>
</html>