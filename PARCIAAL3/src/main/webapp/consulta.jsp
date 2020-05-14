<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<link rel="stylesheet" type="text/css" href="http://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link href="css/estilo.css" rel="stylesheet" type="text/css"/>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<title>Formulario de Registro</title>
</head>
<%
String idmt=request.getParameter("idmt");
String Nmtr=request.getParameter("Nmtr");
String Ape=request.getParameter("Ape");
 if(idmt==null){
	 idmt="";
	 Nmtr="";
	 Ape="";
	 
 }

%>
<body>

<section class="form-login">
<h5>AGREGAR DATOS</h5>
<form action="ServeleteUs">
<table align="center">
<thead>

</thead>
<tbody>
<tr>
<td>

<label>ID</label><input class="controls" type="text" name="Id" id="idcarga" value="<%=idmt %>" >
<label>MATERIA</label><input class="controls" type="text" name="nombre" value="<%=Nmtr %>">
<label>Apellido</label><input class="controls" type="text" name="apellido" value="<%=Ape %>">
<br>
<br>

</td>
</tr>
</tbody>
</table>
</form>
</section>
</body>
</html>