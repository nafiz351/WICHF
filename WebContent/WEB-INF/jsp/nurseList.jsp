<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Nurse List</title>
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
		<br /> <br /> <br /> <b>WICHF | Nurse List </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Nurse Id</td>
				<td class="heading">Name</td>
				<td class="heading">Address</td>
				<td class="heading">Gender</td>
				<td class="heading">Birth Date</td>
				<td class="heading">Email</td>
				<td class="heading">Registration No</td>
				<td class="heading">Phone</td>
				<td class="heading">Edit</td>
				<td class="heading">Delete</td>
			</tr>
			<c:forEach var="nurse" items="${nurseList}">
				<tr>

					<td>${nurse.nurseId}</td>
					<td>${nurse.nurseName}</td>
					<td>${nurse.nurseAddress}</td>
					<td>${nurse.nurseGender}</td>
					<td>${nurse.nurseBirthDate}</td>
					<td>${nurse.nurseEmail}</td>
					<td>${nurse.nurseRegNo}</td>
					<td>${nurse.nursePhone}</td>
					<td><a href="nurseEdit?id=${nurse.nurseId}">Edit</a></td>
					<td><a href="nurseDelete?id=${nurse.nurseId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="nurseRegister">Add New Nurse</a></td></tr>
		</table>

	</center>
</body>
</html>