<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member List Page</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Email</th>
			<th>AGE</th>
			<th>RegDate</th>
		</tr>
		<c:forEach items="${list}" var="mvo">
			<tr>
				<td><a href="#">${mvo.id}</a></td>
				<td><a href="#">${mvo.email}</a></td>
				<td>${mvo.age}</td>
				<td>${mvo.regdate}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/index.jsp"><button type="button">index</button></a>
</body>
</html>