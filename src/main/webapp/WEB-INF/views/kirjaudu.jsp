<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sisäänkirjautuminen</title>

	<!--  LINKIT TYYLITIEDOSTOIHIN -->
	<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
	<link rel="stylesheet" href="../resources/styles/style.css">
	
	<!-- LINKIT SCRIPTEIHIN -->
	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src='http://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
</head>
<header class="jumbobg">
	<img alt="twimmlogo" src="../resources/images/twimm.png" height="200px">
</header>
<body class="text-center">
<div>
	<c:if test="${not empty loginerror}">
		<p class="Error">Sisäänkirjautuminen epäonnistui. Käyttäjätunnus tai salasana on syötetty väärin.</p>
	</c:if>

	<c:if test="${not empty loggedout}">
		<p class="Info">Uloskirjautuminen onnistui</p>
	</c:if>
	<c:url value="/j_spring_security_check" var="loginUrl" />
	<div class="col-md-4"></div>
	<div class="col-md-4">
	<h1>Kirjaudu sisään</h1>
	<form action="${loginUrl}" method="post">
		<div class="kirjautuminen form-group">
		<br><br>
		<label>Sähköposti: </label><input type='text' name='j_username' value='' class="form-control"><br>
		<label>Salasana: </label><input type='password' name='j_password' class="form-control"/><br>
		<button type="submit" class="btn btn-success">Kirjaudu</button>
		<br><br><br><br>
		<a href="/twimm" class="btn btn-default">Etusivulle</a>
		</div>
	</form>
	</div>
	<div class="col-md-4"></div>
	</div>

</body>
</html>