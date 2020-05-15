<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
     $(document).ready(function(){
    	 $('#cargari').click(function (event){
    		 var btn =$('#cargari').val();
    		 $.post('ServeleteConsulta',{
    			 
    			 
    			 
    			 
    		 },function(response) {
    		 let datost = JSON.parse(response);
    		 //console.log(datos);
    		 var tablaDatos=document.getElementById('tablaDatos');
    		 for (let item of datost){
    			 tablaDatos.innerHTML +=`
    		 
    		 <tr>
    		 <td>${item.apellido}</td>
    		 <td>${item.nombre}</td>
    		 <td>${item.idconsulta}</td>
    		 <td>
    		 <a href="ServeleteConsulta?btn=ELIMINAR&Id=${item.idconsulta}" class="btn btn-warning">ELIMINAR</a>
             <a href="funciones.jsp?idmt=${item.idconsulta}&Nmtr=${item.nombre}&Ape=${item.apellido}" class="btn btn-danger">ACTUALIZAR</a></td>
    		 
    		 
    		 
    		 
    		 
    		 
    		 </tr>
    		 
    		 
    		 `
    		 }
    		 });
    		 
    	 });
    			 
    	 
    	 
    	 
     });
    	 
    	 
    	 
</script>
<body>
<table align="center">
<thead>

</thead>
<tbody>
<tr>
<td>
<br>
<br>
</td>
</tr>
</tbody>
</table>

<a href="Usuario.jsp" class="btn btn-info ">Ingresar Usuario</a>  <input type="submit" name="btn" value="cargar" id="cargari"class="btn btn-info "></a>  

<table class="table table-dark" id="tablaDatos">
     <thead>
     <th>APELLIDO </th>
     <th>NOMBRE </th>
     <th>ID </th>
</tbody>
</table>
</body>
</html>