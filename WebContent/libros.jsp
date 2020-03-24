<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.curso.model.Libro,java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Lista de libros</h1>
		<table border="1">
			<tr>
				<th>Titulo</th>
				<th>Autos</th>
				<th>Precio</th>
			</tr>
			<%
				List<Libro> libros = (List<Libro>) request.getAttribute("libros");
				for (Libro l : libros) {
			%>
			<tr>
				<td><%=l.getTitulo()%></td>
				<td><%=l.getAutor()%></td>
				<td><%=l.getPrecio()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<br /> <br /> <a href="temas">Volver</a>
	</center>
</body>
</html>