<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
</head>	
<body>
	<h1>
	
	</h1>
	<c:forEach items="${kiinnostukset}" var="kiinnostus">
	<c:out value="${kiinnostuskset.kiinnostus.id}"/></p>
	<p><c:out value="${kiinnostus}" default="-----"/></p>
	<p><a href="uusi">Takaisin</a></c:forEach>
</body>
</html>
