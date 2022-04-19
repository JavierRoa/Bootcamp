<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" href="../css/MyStyle.css">
	<link rel="shortcut icon" href="https://cdn-icons-png.flaticon.com/512/1233/1233183.png">
	<script defer src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script defer src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
	<script defer src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/additional-methods.min.js"></script>
	<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script defer src="../js/JavaScript.js"></script>
	<title>Orden de servicio</title>
	</head>
	 <body>
        <div id="bg" class="container">
            <div>
                <h1 class="text-center">Formulario de Ingreso</h1>
            </div>
            <div>
                <form name="formulario" id="formulario" method="post" action="/ActividadFinal/AgregarServlet">
                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">                               
                            <h3>Datos Principales</h3>
                            <c:if test="${sessionScope.permiso==1 }">
	                            <div>
		                            <label for="rut">RUT:</label>
		                            <input class="form-control" type="text" name="rut" id="rut" placeholder="Ingrese RUT">
		                        </div>
	                        </c:if>
                            <div>
                                <label for="nombre">Nombre:</label>
                                <input class="form-control" type="text" name="nombre" id="nombre" placeholder="Ingrese Nombre">
                            </div>
                            <div>
                                <label for="tel">Teléfono:</label>
                                <input class="form-control" type="text" name="tel" id="tel" placeholder="Ingrese número de 9 dígitos"> 
                            </div>             
                            <div>
                                <label for="tipoElec">Tipo de Electrodoméstico:</label>
                                <select class="form-select" name="tipoElec" id="tipoElec">
                                    <option value="">Seleccione el tipo de electrodoméstico...</option>
										<c:forEach var="e" items="${sessionScope.electro }">
				                    	<option value="${e.id }"> <c:out value="${ e.electrodomestico }"></c:out></option>
				                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">
                            <h3>Datos Generales</h3>
                            <div>
                                <label for="region">Región:</label>
								<select class="form-control" name="region" id="region">
				                    <option value="">Seleccione región...</option>
				                    <c:forEach var="r" items="${sessionScope.regiones }">
				                    	<option value="${r.id }"> <c:out value="${ r.region }"></c:out></option>
				                    </c:forEach>
				                </select>
                            </div> 
                            <div>
                                <label for="comuna">Comuna:</label>
                                <input class="form-control" type="text" name="comuna" id="comuna" placeholder="Ingrese Comuna">
                            </div>              
                            <div>
                                <label for="direccion">Dirección:</label>
                                <input class="form-control" type="text" name="direccion" id="direccion" placeholder="Ingrese su dirección">
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">
                            <h3>Datos del Servicio</h3>
                            <div>
                                <label for="fecha">Fecha Solicitud:</label>
                                <input class="form-control" type="date" name="fecha" id="fecha" placeholder="DD/MM/AA">
                            </div>
							<c:if test="${sessionScope.permiso==1 }">
	                            <div class="mt-3">
	                                <label for="fecha">Fecha Última Actualización:</label>
	                                <input class="form-control" type="date" name="fechaAct" id="fechaAct" placeholder="DD/MM/AA">
	                            </div>
	                            <br>
	                            <p>Estado del servicio:</p>
		                        <c:forEach var="e" items="${sessionScope.estado }">
		                            <div class="form-check">
		                                <input class="form-check-input" type="radio" name="estado" id="estado">
		                                <label for="estado"> <c:out value="${e.estado }"> </c:out> </label>
		                            </div>
		                        </c:forEach>
                            </c:if>
                        </div>
                    </div>
                    <div class="mt-3 row justify-content-center">
                    	<label for="observacion">Observaciones</label>
                    	<textarea name="obs" id="obs"></textarea>
                    </div>
                    <div class="mt-3 row justify-content-center">
						<div class="col-4 mt-3 row justify-content-center">
							<button class="btn btn-primary" type="submit" onclick="mensaje()">Ingresar</button>
						</div>
						<div class="col-4 mt-3 row justify-content-center">
							<a href="/ActividadFinal/jsp/home.jsp" class="btn btn-primary" role="button">Cerrar Sesión</a>
						</div>
					</div>           
                </form>
            </div>               
        </div>
    </body>
</html>