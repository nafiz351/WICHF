<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Clinic Appointment List</title>
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
		<br /> <br /> <br /> <b>WICHF | Clinic Appointment List </b><br /> <br />
			
		

		<table border="1">
			<tr>
				<td class="heading">Appointment Id</td>
				<td class="heading">Appointment Type</td>
				<td class="heading">Appointment Time Slot</td>
				
			</tr>
			<c:forEach var="clinicAppointment" items="${clinicAppointmentList}">
				<tr>
					<td>${clinicAppointment.clinicAppointmentId}</td>
					<td>${clinicAppointment.clinicAppointmentType}</td>
					<td>${clinicAppointment.clinicAppointmentTimeSlot}</td>
					<td><a href="clinicAppointmentEdit?id=${clinicAppointment.clinicAppointmentId}">Edit</a></td>
					<td><a href="clinicAppointmentDelete?id=${clinicAppointment.clinicAppointmentId}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr><td colspan="7"><a href="clinicAppointmentRegister">Add New Clinic Appointment</a></td></tr>
		</table>

	</center>
</body>
</html>