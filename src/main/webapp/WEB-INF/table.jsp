<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table {
	border-collapse: collapse;
	width: 90%;
	padding: 5px;
}

th {
	background-color: #0398fc;
	color: white;
}

td, th {
	height: 30px;
	width: 20%;
	text-align: center;
	border: 1px solid #ddd;
}

tr:hover {
	background-color: #e0e0e0
}
;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">User Details is Here</h1>
	<hr>
	<table align="center" id="tbl">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Address</th>
		</tr>
		<c:forEach var="list" items="${user}">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.userName}</td>
				<td>${list.password}</td>
				<td>${list.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>