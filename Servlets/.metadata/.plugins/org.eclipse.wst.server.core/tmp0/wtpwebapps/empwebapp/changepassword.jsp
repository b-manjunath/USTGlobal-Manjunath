<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a><a style="float:right" href="./logout">Logout</a>

	<fieldset align="center">
		<legend>Change Password</legend>
		<h4><%=msg%></h4>
		<form action="./changepassword" method="post">
         <table align="center">
			<tr>
				<td>New Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmpassword"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="change password"></td>
			</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>





