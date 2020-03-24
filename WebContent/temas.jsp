<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.curso.model.Tema,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<h1>Seleccione Tema</h1>

	<form action="libros" method="post">
		<select name="topic" style="width: 200px">
			<!-- Coger la lista de temas y mostrarla con un foreach -->
			<option value="0">Todos</option>
			<%
				List<Tema> temas = (List<Tema>) request.getAttribute("temas");
				for (Tema t : temas) {
			%>
			<option value=<%=t.getIdTema()%>><%=t.getTema()%></option>
			<%
				}
			%>
		</select><br> <br> <input type="submit" value="Ver Libros" />
	</form>
	<br>
	<br>

</body>
</html>