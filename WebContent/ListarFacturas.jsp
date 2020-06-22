<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Facturas</title>
</head>
<body>
	<h1>Listado de facturas</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Fecha</th>
			<th>Subtotal</th>
			<th>Impuesto</th>
			<th>Total</th>
		</tr>

		<c:forEach items="${lfacturas}" var="fact">
			<tr>
				<td>${fact.getIdfactura()}</td>
				<td>${fact.getNombrecliente()}</td>
				<td>${fact.getFecha()}</td>
				<td>${fact.getSubtotal()}</td>
				<td>${fact.getImpuesto()}</td>
				<td>${fact.getImpuesto()}</td>
				</tr>
		</c:forEach>

	</table>
	<br />

	<a href="${pageContext.request.contextPath}/CrearFactura">Crear Factura</a>

</body>
</html>