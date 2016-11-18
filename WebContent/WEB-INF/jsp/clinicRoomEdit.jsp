<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Clinic Room Update</title>
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
		<br /> <br /> <br /> <b>Edit Clinic Room Details </b><br /> <br />
		<div>
			<form:form method="post" action="/clinicRoomUpdate" modelAttribute="clinicRoom">
				<table>

				
					<tr>
						<td>Clinic Room Number :</td>
						<td><form:input path="clinicRoomNumber"
								value="${map.clinicRoom.clinicRoomNumber}" />
						</td>
					</tr>
					<tr>
						<td>Phone Extension :</td>
						<td><form:input path="clinicRoomPhoneExt"
								value="${map.clinicRoom.clinicRoomPhoneExt}" />
						</td>
					</tr>
					<tr>
						<td>Phone Extension :</td>
						<td><form:input path="clinicRoomDescription"
								value="${map.clinicRoom.clinicRoomDescription}" />
						</td>
					</tr>
					
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="clinicRoomId" value="${map.clinicRoom.clinicRoomId}" />

			</form:form>
		</div>
	</center>
</body>
</html>