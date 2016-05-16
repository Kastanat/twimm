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
	<p>Profiilin luonti onnistui!</p><br>
	<a href="../kirjaudu/loginpage" class="btn btn-success" role="button">Kirjaudu sisään</a>
</body>
</html>