<html>
<link rel="stylesheet" type="text/css" href="http://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>
<script type="text/javascript">
</script>
<body>
<script type="text/javascript">
	$(document).ready(function () {
          
                var btn = $('#carga').val();
                $.post('ServeleteUs',{// esto es la parte del ajax


                }, function(respose){
                let datos = JSON.parse(respose);
               // console.log(datos);

               var tablaDato=document.getElementById('tablaDato');

                for(let item of datos){
                	

                	tablaDato.innerHTML +=`
                    <tr>
                    <td> ${item.apellido}</td>
                    <td> ${item.nombre}</td> 
                    <td> ${item.idconsulta}</td>
                   
                    <td>
                    <a href="ServeleteMate?btn=ELIMINAR&Id=${item.idconsulta}" class="btn btn-warning">ELIMINAR</a>
                    <a href="Materia.jsp?idmt=${item.idmateria}&Nmtr=${item.nombre}" class="btn btn-danger">ACTUALIZAR</a></td>
                    


 

                     </tr>
                	`
                	}



          	});
          

		// body...
	});


</script>
<body>
<td>
<a href="Usuario.jsp" class="btn btn-info " name="iniciarsesion">Iniciar Secion</a> <a href="index.jsp?idmt=${item.idconsulta}&Nmtr=${item.nombre}&Ape=${item.apellido}" class="btn btn-danger">CARGAR DATOS</a></td>
<table class="table table-dark" id="tablaDato">
	<thead>
		<th>APELLIDO</th>
		<th>NOMBRE</th>
		<TH>ID</TH>
	</thead>

<tbody>
	

</tbody>


</table>

</body>
</html>
