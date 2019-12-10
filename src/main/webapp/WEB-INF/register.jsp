<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<div align="center">
<h1>Register Page</h1><hr><br>
<form action="addUser" method="post" modelAttribute="user">
<input type="text" name="name" Placeholder="Enter Name"><br><br>
<input type="text" name="userName" Placeholder="Enter UserName"><br><br>
<input type="password" name="password" Placeholder="Enter Password"><br><br>
<input type="text" name="address" Placeholder="Enter Address"><br><br>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>