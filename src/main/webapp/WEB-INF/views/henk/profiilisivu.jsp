<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Twimm</title>
	
	<!-- LINKIT CSS -TIEDOSTOIHIN -->
	<link rel="stylesheet" href="../resources/styles/style.css">
	<link rel='stylesheet prefetch'	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
	<!-- Bootstrap core CSS -->
	<link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">		
	<!-- Bootstrap JUMBOTRON-NARROW CSS -LINKKI -->
	<link href="http://getbootstrap.com/examples/jumbotron-narrow/jumbotron-narrow.css" rel="stylesheet">
	
	<!-- SCRIPT LINKIT -->
	<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script	src='http://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
	<script src="resources/js/index.js"></script>
</head>
<body>
	<div class="container jumborunko">
		<div class="jumbotron jumbobg jumboreuna">
		<p class="text-right kirjautumisilmo">Sisäänkirjautuneena: <sec:authentication property="principal.username"/>, <a href="../j_spring_security_logout" class="uloskirjaus">kirjaudu ulos</a></p>
			<img src="../resources/images/tinder.png" alt="twimmlogo" class="profiilikuva">
			<div class="jumbotext">
				<h2><c:out value="${kayttaja.etunimi}" default="-----"/>&nbsp;<c:out value="${kayttaja.sukunimi}" default="-----"/></h2>
				<p class="lead"><c:out value="${kayttaja.kuvaus}" default="-----"/></p>
			</div>
		</div>
		<div class="row marketing">
			<div class="col-lg-6">
			
				<p><b>Kiinnostuksesi:</b></p>
				<c:forEach var="kiinnostus" items="kiinnostukset">
				    <c:out value="${kiinnostus}"/><p />
				</c:forEach>
			</div>
			<div class="col-lg-6 ruudunjakaja">
			<ul class="media-list main-list">
			<c:forEach items="${kayttajat}" var="kayt">
			  <li class="media">
			    <div class="pull-left">
			      <img class="media-object" src="../resources/images/tinder.png" alt="käyttäjän profiilikuvake" id="kuvake">
			    </div>
			    <div class="media-body">
			      <h4 class="media-heading"><c:out value="${kayt.etunimi}"/> <c:out value="${kayt.sukunimi}"/></h4>
			      <p class="by-author"><c:forEach items="${kayt.kiinnostukset}" var="kiin"><c:out value="${kiin.kiinnostus}"/>, </c:forEach></p>
			    </div>
			  </li>
			  </c:forEach>
			  <li class="media">
			    <div class="pull-left">
			      <img class="media-object" src="../resources/images/tinder.png" alt="käyttäjän profiilikuvake" id="kuvake">
			    </div>
			    <div class="media-body">
			      <h4 class="media-heading">Henkilö Heppu</h4>
			      <p class="by-author">Yhteisiä kiinnostuksia X kpl</p>
			    </div>
			  </li>
			  <li class="media">
			    <div class="pull-left">
			      <img class="media-object" src="../resources/images/tinder.png" alt="käyttäjän profiilikuvake" id="kuvake">
			    </div>
			    <div class="media-body">
			      <h4 class="media-heading">Laijo Jeppinen</h4>
			      <p class="by-author">Yhteisiä kiinnostuksia X kpl</p>
			    </div>
			  </li>
			</ul>
				
			</div>
		</div>
	</div>

	<p>
		<!--  <c:out value="${kayttaja.sahkoposti}" default="-----"/> -->
</body>
</html>