<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Modify Page</h1>
	<form action="/brd/edit" method="post">
		<table border="1">
			<tr>
				<th>BNO</th>
				<td>
					<input type="text" readonly="readonly" value="${bvo.bno}" name="bno">
				</td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td>
					 <input type="text" name="title" value="${bvo.title}">
				</td>
			</tr>
			<tr>
				<th>WRITER</th>
				<td>
					<input type="text" name="writer" value="${bvo.writer}">
				</td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td>
					<textarea rows="3" cols="50" name="content">${bvo.content}</textarea>
				</td>
			</tr>
			<tr>
				<th>REGDATE</th>
				<td>
					${bvo.regdate}	
				</td>
			</tr>
			<tr>
				<th>MODDATE</th>
				<td>
					${bvo.moddate}
				</td>
			</tr>
		</table>
		<button type="submit">수정</button>
	</form>
</body>
</html>