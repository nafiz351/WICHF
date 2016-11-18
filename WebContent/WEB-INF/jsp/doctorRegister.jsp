<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Doctor Registration</title>
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

<% /* private int docId;
private String docName;
private String docAddress;
private String docGender;
private String docBirthDate;
private String docEmail;
private String docRegNo;
private String docPhone; */ %>

</head>
<body>
	<center>
		<br /> <br /> <br /> <b>WICHF | Doctor Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/doctorInsert" modelAttribute="doctor">
			
				<table>
					<tr>
						<td>Doctor Name :</td>
						<td><form:input path="doctorName" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="doctorAddress" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:select path="doctorGender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="doctorBirthDate" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="doctorEmail" /></td>
					</tr>
					<tr>
						<td>Registration Number :</td>
						<td><form:input path="doctorRegNo" /></td>
					</tr>
					<tr>
						<td>Phone :</td>
						<td><form:input path="doctorPhone" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getDoctorList">Doctor List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

