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
	<c:set var="editar" value="${ sessionScope.editar }"></c:set>
	</head>
	 <body>
        <div id="bg" class="container">
            <div>
                <h1 class="text-center">Formulario de Ingreso</h1>
            </div>
            <div>
                <form name="formulario" id="formulario" method="post" action="/ActividadFinal/ActualizarServlet">
                    <div class="row">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">                               
                            <h3>Datos Principales</h3>
                            <c:if test="${sessionScope.permiso==1 }">
	                            <div>
		                            <label for="rut">RUT:</label>
		                            <input value="${ editar.rut }" class="form-control" type="text" name="rut" id="rut" placeholder="Ingrese RUT" readonly>
		                            <input value="${ editar.id }" type="hidden" class="form-control" name="id" id="id" readonly>
		                        </div>
	                        </c:if>
                            <div>
                                <label for="nombre">Nombre:</label>
                                <input value="${ editar.nCliente }" class="form-control" type="text" name="nombre" id="nombre" placeholder="Ingrese Nombre" readonly>
                            </div>
                            <div>
                                <label for="tel">Teléfono:</label>
                                <input value="${ editar.tCliente }" class="form-control" type="text" name="tel" id="tel" placeholder="Ingrese número de 9 dígitos" readonly> 
                            </div>             
                            <div>
                                <label for="tipoElec">Tipo de Electrodoméstico:</label>
                                <input value="${ editar.tipoElec.electrodomestico }" class="form-control" name="tipoElec" id="tipoElec" readonly>
                            	<input value="${ editar.tipoElec.id }" type="hidden" class="form-control" name="tipoElecId" id="tipoElecId" readonly>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">
                            <h3>Datos Generales</h3>
                            <div>
                                <label for="region">Región:</label>
								<input value="${ editar.region.region }" class="form-control" name="region" id="region" readonly>
								<input value="${ editar.region.id }" type="hidden" class="form-control" name="regionId" id="regionId" readonly>
                            </div> 
                            <div>
                                <label for="comuna">Comuna:</label>
                                <input value="${ editar.comuna }" class="form-control" type="text" name="comuna" id="comuna" placeholder="Ingrese Comuna" readonly>
                            </div>              
                            <div>
                                <label for="direccion">Dirección:</label>
                                <input value="${ editar.dCliente }" class="form-control" type="text" name="direccion" id="direccion" placeholder="Ingrese su dirección" readonly>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 mt-3">
                            <h3>Datos del Servicio</h3>
                            <div>
                                <label for="fecha">Fecha Solicitud:</label>
                                <input value="${ editar.fecha }" class="form-control" type="date" name="fecha" id="fecha" placeholder="DD/MM/AA" readonly>
                            </div>
							<c:if test="${sessionScope.permiso==1 }">
	                            <div class="mt-3">
	                                <label for="fechaAct">Fecha Última Actualización:</label>
	                                <input value="${ editar.fechaAct }" class="form-control" type="date" name="fechaAct" id="fechaAct" min="${editar.fechaAct }">
	                            </div>
	                            <br>
	                            <p>Estado del servicio:</p>
		                        <c:forEach var="e" items="${sessionScope.estado }">
		                        	<c:choose>
		                        		<c:when test="${e.id==editar.estado.id}">
		                        			<div class="form-check">
			                        			<input class="form-check-input" type="radio" name="estado" id="estado" value="${e.id }" checked>
			                                	<label for="estado"> <c:out value="${e.estado }"> </c:out> </label>
		                                	</div>
		                        		</c:when>
		                        		<c:otherwise>
		                        			<div class="form-check">
												<input class="form-check-input" type="radio" name="estado" id="estado" value="${e.id }">
		                                		<label for="estado"> <c:out value="${e.estado }"> </c:out> </label>		                        		
		                        			</div>
		                        		</c:otherwise>
		                        	</c:choose>	
		                        </c:forEach>
                            </c:if>
                        </div>
                    </div>
                    <div class="mt-3 row justify-content-center">
                    	<label for="observacion">Observaciones</label>
                    	<textarea value="" name="obs" id="obs"></textarea>
                    </div>
                    <div class="mt-3 row justify-content-center">
						<div class="col-4 mt-3 row justify-content-center">
							<button class="btn btn-primary" type="submit">Ingresar</button>
						</div>
					</div>           
                </form>
            </div>               
        </div>
    </body>
</html></html>