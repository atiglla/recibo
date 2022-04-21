<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Receipt</title>
</head>
<body>
<<h1>Customer Name: <c:out value="${nombre}"></c:out></h1>
<p>Item name: <c:out value="${item}"></c:out></p>
<p>Price: <c:out value="${precio}"></c:out></p>
<p>Description: <c:out value="${descripcion}"></c:out></p>
<p>Vendor: <c:out value="${vendedor}"></c:out></p>

</body>
</html>