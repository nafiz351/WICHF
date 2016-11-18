<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Login List</title>
<style>
body {
	font-size: 20px;
	color: teal;
	font-family: Calibri;
}

td {
	font-size: 15px;
	color: black;
	width: 100px;
	height: 22px;
	text-align: center;
}
.heading {
	font-size: 18px;
	color: white;
	font: bold;
	background-color: orange;
	border: thick;
}
</style>
</head>
<body>
	<center>
		<br /> <br /> <br /> <b>WICHF | Login List </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Login Id</td>
				<td class="heading">Login Name</td>
				<td class="heading">Login Password</td>
				<td class="heading">Login Type</td>
						</tr>
			<c:forEach var="login" items="${loginList}">
				<tr>

					<td>${login.loginId}</td>
					<td>${login.loginName}</td>
					<td>${login.loginPassword}</td>
					<td>${login.loginType}</td>
					<td><a href="loginEdit?id=${login.loginId}">Edit</a></td>
					<td><a href="loginDelete?id=${login.loginId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="loginRegister">Add New Login</a></td></tr>
		</table>

	</center>
</body>
</html>