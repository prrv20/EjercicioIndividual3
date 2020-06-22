<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Facturas</title>
</head>
<body>
	<h1>Crear factura</h1>

	<form method="post" action="CrearFactura">
		Nombre cliente : <input type="text" name="nombre" /><br/><br/>
		Fecha : <input type="text" name="fecha" /><br/><br/>
		Sub-Total : <input type="text" name="subtotal"/><br/><br/>
		Impuesto : <input type="text" name="impuesto"/><br/><br/>
		<input type="submit" value="Crear factura" /> <br/>
	</form>
	<br/>

	<a href="${pageContext.request.contextPath}/ListarFacturas">Volver al listado</a>

</body>
</html>