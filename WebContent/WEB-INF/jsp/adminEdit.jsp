<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Administrator Update</title>
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
		<br /> <br /> <br /> <b>Edit Administrator Details </b><br /> <br />
		<div>
			<form:form method="post" action="/adminUpdate" modelAttribute="admin">
				<table>
				
				
					<tr>
						<td>Administrator Name :</td>
						<td><form:input path="adminName"
								value="${map.admin.adminName}" />
						</td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="adminAddress"
								value="${map.admin.adminAddress}" />
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><spring:bind path="adminGender">
								<c:forEach items='${map.genderList}' var='genderName'>
									<c:choose>
										<c:when test="${genderName eq map.admin.adminGender}">
											<input type="radio" name="adminGender" value="${genderName}"
												checked="checked">${genderName}
										</c:when>
										<c:otherwise>
											<input type="radio" name="adminGender" value="${genderName}">${genderName}
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</spring:bind>
						</td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="adminBirthDate"
								value="${map.admin.adminBirthDate}" />
						</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="adminEmail"
								value="${map.admin.adminEmail}" />
						</td>
					</tr>
					<tr>
						<td>Phone No :</td>
						<td><form:input path="adminPhone"
								value="${map.admin.adminPhone}" />
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="adminId" value="${map.admin.adminId}" />

			</form:form>
		</div>
	</center>
</body>
</html>