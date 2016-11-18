<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Patient List</title>
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
		<br /> <br /> <br /> <b>WICHF | Patient List </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Patient Id</td>
				<td class="heading">Name</td>
				<td class="heading">Address</td>
				<td class="heading">Gender</td>
				<td class="heading">Birth Date</td>
				<td class="heading">Email</td>
				<td class="heading">Health Card No</td>
				<td class="heading">Phone</td>
				<td class="heading">Edit</td>
				<td class="heading">Delete</td>
			</tr>
			<c:forEach var="patient" items="${patientList}">
				<tr>

					<td>${patient.patientId}</td>
					<td>${patient.patientName}</td>
					<td>${patient.patientAddress}</td>
					<td>${patient.patientGender}</td>
					<td>${patient.patientBirthDate}</td>
					<td>${patient.patientEmail}</td>
					<td>${patient.patientHealthCardNo}</td>
					<td>${patient.patientPhone}</td>
					<td><a href="patientEdit?id=${patient.patientId}">Edit</a></td>
					<td><a href="patientDelete?id=${patient.patientId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="patientRegister">Add New Patient</a></td></tr>
		</table>

	</center>
</body>
</html>