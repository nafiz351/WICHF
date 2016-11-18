<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>WICHF | Login </title>
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
		<br /> <br /> <br /> <b>WICHF | Login </b> <br />
		<br />
		<div>
			<form:form method="post" action="/loginInsert" modelAttribute="login">
			
				<table>
					<tr>
						<td>User Name  :</td>
						<td><form:input path="loginName" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><form:input path="loginPassword" /></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Login" /></td>
					</tr>
					<tr><td colspan="2"><a href="getLoginList">Login List</a></td>
					</tr>
				</table>
				
				
			</form:form>
		</div>
	</center>
</body>
</html>

