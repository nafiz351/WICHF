<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>WICHF| Login Update</title>
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
		<br /> <br /> <br /> <b>Edit Login Details </b><br /> <br />
		<div>
			<form:form method="post" action="/loginUpdate" modelAttribute="login">
				<table>

				
					<tr>
						<td>Login Name :</td>
						<td><form:input path="loginName"
								value="${map.login.loginName}" />
						</td>
					</tr>
					<tr>
						<td>Login Password :</td>
						<td><form:input path="loginPassword"
								value="${map.login.loginPassword}" />
						</td>
					</tr>
					<tr>
						<td>Login Type :</td>
						<td><form:input path="loginType"
								value="${map.login.loginType}" />
						</td>
					</tr>
					
					
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" />
						</td>
					</tr>
				</table>
				<form:hidden path="loginId" value="${map.login.loginId}" />

			</form:form>
		</div>
	</center>
</body>
</html>