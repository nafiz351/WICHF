<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Doctor Update</title>
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
		<br /> <br /> <br /> <b>Edit Doctor Details </b><br /> <br />
		<div>
			<form:form method="post" action="/doctorUpdate" modelAttribute="doctor">
				<table>
				
				
					<tr>
						<td>Doctor Name :</td>
						<td><form:input path="doctorName"
								value="${map.doctor.doctorName}" />
						</td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="doctorAddress"
								value="${map.doctor.doctorAddress}" />
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="doctorGender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.doc.doctorGender}">
											<input type="radio" name="doctorGender" value="${genderName}"
												checked="checked">${genderName}
										</c:when>
										<c:otherwise>
											<input type="radio" name="doctorGender" value="${genderName}">${genderName}
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind>
						</td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="doctorBirthDate"
								value="${map.doctor.doctorBirthDate}" />
						</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="doctorEmail"
								value="${map.doctor.doctorEmail}" />
						</td>
					</tr>
					<tr>
						<td>Registration No :</td>
						<td><form:input path="doctorRegNo"
								value="${map.doctor.doctorRegNo}" />
						</td>
					</tr>
					<tr>
						<td>Phone No :</td>
						<td><form:input path="doctorPhone"
								value="${map.doctor.doctorPhone}" />
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="doctorId" value="${map.doctor.doctorId}" />

			</form:form>
		</div>
	</center>
</body>
</html>