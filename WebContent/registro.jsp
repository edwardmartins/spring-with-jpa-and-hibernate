<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registro de usuarios</h1>
	<form action="alta" method="POST">
		Usuario: <br><input type="text" name="usuario" /><br>
		Password: <br><input type="text" name="pass" /><br>
		Email: <br><input type="text" name="email" /><br>
		Telefono: <br><input type="number" name="telef"> <br><br>
		<input type="submit" value="Registrar" /><br>
	</form> <br><br>
	<a href="toLogin">Volver</a>
</body>
</html>