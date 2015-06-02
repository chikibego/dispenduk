<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Daftar Agama</title>
</head>
<body>
	<h2>Daftar Agama</h2>
	<table>
		<tr>
			<th>UUID</th>
			<th>Jenis Agama</th>
		</tr>
		<c:forEach items="${listAgama}" var="agama">
			<tr>
				<td>#{agama.idAgama}</td>
				<td>#{agama.jenisAgama}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>