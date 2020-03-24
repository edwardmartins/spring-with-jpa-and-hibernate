<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Autenticacion</h1>
	<form action="login" method="POST">
		Usuario: <br> <input type="text" name="usuario" /><br>
		Password: <br> <input type="text" name="pass" /><br> <br> 
		<input type="submit" value="Entrar" /><br><br>
		<a href="toRegistro">Registrese</a>
	</form>
</body>
</html>