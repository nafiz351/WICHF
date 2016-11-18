<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Patient Registration</title>
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
		<br /> <br /> <br /> <b>WICHF | Patient Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/patientInsert" modelAttribute="patient">
			
				<table>
					<tr>
						<td>Patient Name :</td>
						<td><form:input path="patientName" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="patientAddress" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:select path="patientGender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="patientBirthDate" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="patientEmail" /></td>
					</tr>
					<tr>
						<td>Health Card Number :</td>
						<td><form:input path="patientHealthCardNo" /></td>
					</tr>
					<tr>
						<td>Phone :</td>
						<td><form:input path="patientPhone" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getPatientList">Patient List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

