<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Clinic Room Registration</title>
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
		<br /> <br /> <br /> <b>WICHF | Clinic Room Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/clinicRoomInsert" modelAttribute="clinicRoom">
			
				<table>
					<tr>
						<td>Clinic Room No :</td>
						<td><form:input path="clinicRoomNumber" /></td>
					</tr>
					<tr>
						<td>Phone Extension :</td>
						<td><form:input path="clinicRoomPhoneExt" /></td>
					</tr>
					<tr>
						<td>Description :</td>
						<td><form:input path="clinicRoomDescription" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getClinicRoomList">Clinic Room List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

