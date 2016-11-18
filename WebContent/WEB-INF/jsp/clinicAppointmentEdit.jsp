<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Clinic Appointment Update</title>
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
		<br /> <br /> <br /> <b>Edit Clinic Appointment Details </b><br /> <br />
		<div>
			<form:form method="post" action="/clinicAppointmentUpdate" modelAttribute="clinicAppointment">
				<table>
					
					
					
					<tr>
						<td> Appointment Type  :</td>
						<td><form:input path="clinicAppointmentType"
								value="${map.clinicAppointment.clinicAppointmentType}" />
						</td>
					</tr>
					
				
					<tr>
						<td> Appointment Time Slot:</td>
						<td><form:input path="clinicAppointmentTimeSlot"
								value="${map.clinicAppointment.clinicAppointmentTimeSlot}" />
						</td>
					</tr>
								
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="clinicAppointmentId" value="${map.clinicAppointment.clinicAppointmentId}" />

			</form:form>
		</div>
	</center>
</body>
</html>