<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Administrator Registration</title>
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
		<br /> <br /> <br /> <b>WICHF | Administrator Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/adminInsert" modelAttribute="admin">
			
				<table>
					<tr>
						<td>Administrator Name :</td>
						<td><form:input path="adminName" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="adminAddress" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:select path="adminGender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="adminBirthDate" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="adminEmail" /></td>
					</tr>
					<tr>
						<td>Phone :</td>
						<td><form:input path="adminPhone" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getAdminList">Administrator List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

