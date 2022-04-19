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
<title>Home</title>
</head>
<body>
	<div class="container">		
		<div class="row d-flex justify-content-center">
		<h1>Ingreso</h1>
			<div class="col col-lg-8">
				<div>
					<form class="form" id="formulario" method="post" action="/ActividadFinal/LoginServlet">
						<div class="form-group">
							<label>Usuario</label>
							<input type="text" placeholder="Ingrese su usuario" name="usuario" id="usuario" class="form-control" required>												
						</div>
						<div class="form-group">
							<label>Contraseña</label>
							<input type="password" placeholder="Ingrese su contraseña" name="clave" id="clave" class="form-control" required>												
						</div>
						<div class="mt-3 row justify-content-center">
							<div class="col-4 mt-3 row justify-content-center">
								<button class="btn btn-primary" type="submit">Ingresar</button>
							</div>
						</div>
					</form>
				</div>
			</div>			
		</div>
	</div>
</body>
</html>