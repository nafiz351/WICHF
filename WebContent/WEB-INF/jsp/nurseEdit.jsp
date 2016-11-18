<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Nurse Update</title>
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
		<br /> <br /> <br /> <b>Edit Nurse Details </b><br /> <br />
		<div>
			<form:form method="post" action="/nurseUpdate" modelAttribute="nurse">
				<table>
				
				
					<tr>
						<td>Nurse Name :</td>
						<td><form:input path="nurseName"
								value="${map.nurse.nurseName}" />
						</td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="nurseAddress"
								value="${map.nurse.nurseAddress}" />
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="nurseGender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.doc.nurseGender}">
											<input type="radio" name="nurseGender" value="${genderName}"
												checked="checked">${genderName}
										</c:when>
										<c:otherwise>
											<input type="radio" name="nurseGender" value="${genderName}">${genderName}
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind>
						</td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="nurseBirthDate"
								value="${map.nurse.nurseBirthDate}" />
						</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="nurseEmail"
								value="${map.nurse.nurseEmail}" />
						</td>
					</tr>
					<tr>
						<td>Registration No :</td>
						<td><form:input path="nurseRegNo"
								value="${map.nurse.nurseRegNo}" />
						</td>
					</tr>
					<tr>
						<td>Phone No :</td>
						<td><form:input path="nursePhone"
								value="${map.nurse.nursePhone}" />
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="nurseId" value="${map.nurse.nurseId}" />

			</form:form>
		</div>
	</center>
</body>
</html>