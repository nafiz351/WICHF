<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Clinic Appointment Registration</title>
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
	text-align: left;
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
		<br /> <br /> <br /> <b>WICHF | Clinic Appointment Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/clinicAppointmentInsert" modelAttribute="clinicAppointment">
			
				<table>
				
					
					<tr>
						<td>Appointment Type:</td>
						<td><form:input path="clinicAppointmentType" /></td>
					</tr>
					
					
					
					<tr>
						<td>Appointment Time Slot:</td>
						<td><form:input path="clinicAppointmentTimeSlot" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getClinicAppointmentList">Clinic Appointment List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

