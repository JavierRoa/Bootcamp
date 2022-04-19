<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- BOOTSTRAP (CSS) -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- DATATABLES (CSS) -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs5/dt-1.11.5/datatables.min.css"/>
<!-- ESTILO DE VENTANA RESUMEN (CSS) -->
<link href="../css/MyStyle.css" rel="stylesheet">
<link rel="shortcut icon" href="https://cdn-icons-png.flaticon.com/512/1233/1233183.png">
<!-- JQUERY (JS) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- DATATABLES (JS) -->
<script type="text/javascript" src="https://cdn.datatables.net/v/bs5/dt-1.11.5/datatables.min.js"></script>
<!-- CONFIGURACIÓN PERSONALIZADA DE DATATABLES (JS) -->
<script src="../js/tabla.js"></script>
<title>Resumen</title>	
<c:set var="orden" value="${sessionScope.orden}"  />
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col col-lg-12">
				<table class="table" id="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">RUT</th>
							<th scope="col">Cliente</th>
							<th scope="col">Teléfono</th>
							<th scope="col">Tipo Elec.</th>
							<th scope="col">Region</th>
							<th scope="col">Comuna</th>
							<th scope="col">Dirección</th>
							<th scope="col">Fecha</th>
							<th scope="col">Fecha Act.</th>
							<th scope="col">Estado</th>
							<th scope="col">Observación</th>
							<c:if test="${sessionScope.permiso==1 }">
								<th scope="col">Modificar</th>
							</c:if>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="orden" items="${ sessionScope.orden }">
						<tr>
							<td> <c:out value="${ orden.id}"  /> </td>
							<td> <c:out value="${ orden.rut }" /> </td>
							<td> <c:out value="${ orden.nCliente}"></c:out> </td>
							<td> <c:out value="${ orden.tCliente}" /></td>
							<td> <c:out value="${ orden.tipoElec.electrodomestico}" /></td>
							<td> <c:out value="${ orden.region.region}"  /> </td>
							<td> <c:out value="${ orden.comuna}"></c:out> </td>
							<td> <c:out value="${ orden.dCliente}" /></td>
							<td> <c:out value="${ orden.fecha}" /></td>
							<td> <c:out value="${ orden.fechaAct}" /></td>
							<td> <c:out value="${ orden.estado.estado}" /></td>
							<td> <c:out value="${ orden.obs }" /></td>
							<c:if test="${sessionScope.permiso==1 }">
								<td>
									<form action="/ActividadFinal/ModificarServlet" method="post">
										<input type="hidden" value="${orden.id}" name="id">
										<input class="btn btn-primary" type="submit" value="Modificar">
									</form>
								</td>
							</c:if>	
						</tr>
						</c:forEach>
					</tbody>
				</table>			
			</div>
		</div>
		<div class="">
			<a href="/ActividadFinal/jsp/home.jsp" class="btn btn-primary" role="button">Cerrar Sesión</a>
		</div>
	</div>
</body>
</html>