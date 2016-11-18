<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Doctor List</title>
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
		<br /> <br /> <br /> <b>WICHF | Doctor List </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Doctor Id</td>
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
			<c:forEach var="doctor" items="${doctorList}">
				<tr>

					<td>${doctor.doctorId}</td>
					<td>${doctor.doctorName}</td>
					<td>${doctor.doctorAddress}</td>
					<td>${doctor.doctorGender}</td>
					<td>${doctor.doctorBirthDate}</td>
					<td>${doctor.doctorEmail}</td>
					<td>${doctor.doctorRegNo}</td>
					<td>${doctor.doctorPhone}</td>
					<td><a href="doctorEdit?id=${doctor.doctorId}">Edit</a></td>
					<td><a href="doctorDelete?id=${doctor.doctorId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="doctorRegister">Add New Doctor</a></td></tr>
		</table>

	</center>
</body>
</html>