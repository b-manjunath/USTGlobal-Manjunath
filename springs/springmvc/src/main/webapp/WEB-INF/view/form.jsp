<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<label text align="center">Registration</label>
		<form action="./form" method="post">
			<table>
				<tr>
					<td>Id:</td>
					<td> <input type="text" name="id">
					</td>
				</tr>
				<tr>
					<td>Name:</td><td> <input type="text" name="name">
					</td>
				</tr>
				<tr>
					<td>Password:</td><td> <input type="password" name="password">
					</td>
				</tr>
				<tr>
				<td>Date:</td>
				<td><input type="Date" name="doj" placeholder="yyyy-MM-dd"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td> <input type="text" name="gender" value=""></td>
					</tr>
					<tr>
					<td><input type="reset" type="reset"> 
					<input type="submit" type="submit">
					</td>
					</tr>
					
			</table>
		</form>
	</fieldset>
</body>
</html>