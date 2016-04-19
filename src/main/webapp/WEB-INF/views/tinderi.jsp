<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Twimm</title>
	
		<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
		<link rel="stylesheet" href="resources/styles/style.css">
		
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		<script src='http://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
		<script>
		
		var lista = [];
		<c:forEach items="${kiinnostukset}" var="kiinnostus">
		  var arr = [];

		  arr.push("<c:out value="${kiinnostus.kiinnostus}" />");

		  lista.push(arr);
		</c:forEach>
		
		 /*var lista = [ 
		              "Dokumentointi",
		              "XML",
		              "CSS",
		              "Tietokannat",
		              "HTML",
		              "UI suunnittelu",
		              "Javascript",
		              "SQL",
		              ".NET",
		              "C#",
		              "Python",
		              "iOS",
		              "PHP",
		              "Java",
		              "Android",
		              "Java EE",
		              "Spring",
		              "Drupal",
		              "C",
		              "MongoDB",
		              "jQuery",
		              "Ruby",
		              "Scala",
		              "Ruby on Rails",
		              "Node.js",
		              "Maven",
		              "Rest",
		              "C++",
		              "Angular.js"
		            ];*/
		</script>
		<script src="resources/js/index.js"></script>  
	
	</head>
	 
	<body class="text-center">
		<div class="col-md-4">
			<div class="tinder"><button value="no" class="nappi btn pull-right"><span class="glyphicon glyphicon-thumbs-down"></span></button>
			</div>
		</div>
	<div class="col-md-4">
		<div class="tinder">
			<h1 id="teksti"></h1>
		</div>
		<div class="aloitus">
			<h1 style="color: red;">
				<b>SOFTALATINDERI</b>
			</h1>
			<br>
			<br>
			<p>
				Ruudulle listautuu eri aihepiirejä. <br>Taitotasosta
				riippumatta, vastaa sen perusteella kiinnostaako aihe, vaikket vielä
				tuntisikaan sitä.
			</p>
			<br>
			<button class="alkaa btn">Aloita tästä</button>
		</div>
		
		<div class="kiinnostavat">
			<div class="tinder">
			
			</div>
		</div><br>
		<div class="lomake">
			<a href="kayttajat/lomake" style="color: red;">Siirry luomaan profiili</a><br> <a href="kayttajat/profiilisivu" style="color: red;">Näytä</a>
		</div>
	</div>
	<div class="col-md-4">
		<div class="tinder">
			<button value="yes" class="nappi btn pull-left">
				<span class="glyphicon glyphicon-thumbs-up"></span>
			</button>
		</div>
	</div>
</body>
</html>
