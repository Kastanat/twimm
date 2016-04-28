<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Twimm</title>

<link rel="stylesheet" href="../resources/styles/style.css">

<link rel='stylesheet prefetch'	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
<!-- Bootstrap core CSS -->
    <link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://getbootstrap.com/examples/jumbotron-narrow/jumbotron-narrow.css" rel="stylesheet">

<script
	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script
	src='http://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
<script src="resources/js/index.js"></script>

</head>
<body>
	<div class="container">
		<div class="jumbotron" id="jumbobg">
			<img alt="kuva" src="../resources/images/tinder.jpg" style="border-radius:100%;max-width:30%;">
			<span id="jumbotext">
				<h2>Esimerkki Käyttäjä</h2>
				<p class="lead">Tämä on lyhyt kuvaus</p>
			</span>
		</div>
		<div class="row marketing">
			<div class="col-lg-6" id="kiinnostusboxleft">
			
				<p><b>Kiinnostukset: asdfasdfasfd</b></p>
				Voihan venäjä
			</div>
			

			<div class="col-lg-6">

				<p>Kiinalainen koira: </p>
				
			</div>
		</div>
	</div>









	<h1>Profiilisivu</h1>
	
	<p><c:out value="${kayttaja.etunimi}" default="-----"/></p>
	<p><c:out value="${kayttaja.sukunimi}" default="-----"/></p>
	<p><c:out value="${kayttaja.sahkoposti}" default="-----"/></p>
	<p><c:out value="${kayttaja.kuvaus}" default="-----"/></p>
	<p>Kiinnostuksesi: </p>
	<p><c:forEach var="kiinnostus" items="kiinnostukset">
	    <c:out value="${kiinnostus}"/><p>
	</c:forEach> 
	<p>
		<a href="uusi">Takaisin</a>
</body>
</html>