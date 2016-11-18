<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Patient Update</title>
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
		<br /> <br /> <br /> <b>Edit Patient Details </b><br /> <br />
		<div>
			<form:form method="post" action="/patientUpdate" modelAttribute="patient">
				<table>
				
				
					<tr>
						<td>Patient Name :</td>
						<td><form:input path="patientName"
								value="${map.patient.patientName}" />
						</td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="patientAddress"
								value="${map.patient.patientAddress}" />
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="patientGender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.patient.patientGender}">
											<input type="radio" name="patientGender" value="${genderName}"
												checked="checked">${genderName}
										</c:when>
										<c:otherwise>
											<input type="radio" name="patientGender" value="${genderName}">${genderName}
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind>
						</td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="patientBirthDate"
								value="${map.patient.patientBirthDate}" />
						</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="patientEmail"
								value="${map.patient.patientEmail}" />
						</td>
					</tr>
					<tr>
						<td>Registration No :</td>
						<td><form:input path="patientHealthCardNo"
								value="${map.patient.patientHealthCardNo}" />
						</td>
					</tr>
					<tr>
						<td>Phone No :</td>
						<td><form:input path="patientPhone"
								value="${map.patient.patientPhone}" />
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="patientId" value="${map.patient.patientId}" />

			</form:form>
		</div>
	</center>
</body>
</html>