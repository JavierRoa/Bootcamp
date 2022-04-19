<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="../css/MyStyle.css">
<link rel="shortcut icon" href="https://cdn-icons-png.flaticon.com/512/1233/1233183.png">
<script defer src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script defer src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
<script defer src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script defer src="../js/JavaScript.js"></script>
<title>¡Bienvenido!</title>
</head>
<body>
	<div class="container">
		<div class="row mt-3 text-dark justify-content-center">
			<div class="col-lg-6">
				<h1 class="text-center text-light">¡Bienvenido!</h1>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-lg-8">
				<div class="card-group mt-4">
					<div class="card text-dark align-items-center pt-3 bg-danger bg-gradient" id="menu1">
					    <div class="card-body">
						    <h5 class="card-title">Formulario</h5>
						    <p class="card-text">Por este medio, puede ingresar una nueva orden para la revisión y reparación de su electrodoméstico</p>
						    <div class="mb-3 position-absolute bottom-0 end-10">
						    	<a href="/ActividadFinal/FormServlet" class="btn btn-primary" role="button">Ir al formulario</a>
					    	</div>
					    </div>
					</div>
					<div class="card text-dark align-items-center pt-3 bg-danger bg-gradient" id="menu2">
		    			<div class="card-body">
						    <h5 class="card-title">Resumen</h5>
						    <p class="card-text">Por aquí, puede ingresar al registro de las reparaciones realizadas a productos asociados a su rut</p>
						    <br>
						    <div class="mb-3 position-absolute bottom-0 end-10">
			    				<a href="/ActividadFinal/TableServlet" class="btn btn-primary" role="button">Ir al resumen</a>
		    				</div>
		    			</div>
					</div>
				</div>	
			</div>
		</div>
	</div>
	<div class="row justify-content-center">
		<div class="col-2 mt-3 row justify-content-center">
			<a href="/ActividadFinal/jsp/home.jsp" class="btn btn-primary" role="button">Cerrar Sesión</a>
		</div>
	</div>
</body>
</html>