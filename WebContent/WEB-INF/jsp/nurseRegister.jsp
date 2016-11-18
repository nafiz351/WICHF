<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Nurse Registration</title>
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
		<br /> <br /> <br /> <b>WICHF | Nurse Registration Form </b> <br />
		<br />
		<div>
			<form:form method="post" action="/nurseInsert" modelAttribute="nurse">
			
				<table>
					<tr>
						<td>Nurse Name :</td>
						<td><form:input path="nurseName" /></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><form:input path="nurseAddress" /></td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td><form:select path="nurseGender"
								items="${map.genderList}" /></td>
					</tr>
					<tr>
						<td>Birth Date :</td>
						<td><form:input path="nurseBirthDate" /></td>
					</tr>
					<tr>
						<td>Email :</td>
						<td><form:input path="nurseEmail" /></td>
					</tr>
					<tr>
						<td>Registration Number :</td>
						<td><form:input path="nurseRegNo" /></td>
					</tr>
					<tr>
						<td>Phone :</td>
						<td><form:input path="nursePhone" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr><td colspan="2"><a href="getNurseList">Nurse List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

