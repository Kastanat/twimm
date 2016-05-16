<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Luo profiili</title>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>
<link rel="stylesheet" href="resources/styles/style.css">
</head>
<body>
	<div class="col-md-6 col-md-offset-3">
		<form:form class="form-horizontal" modelAttribute="kayttaja" method="POST">
			<h3>Luo profiili:</h3>
			<div class="form-group">
				<form:label path="etunimi">Etunimi: </form:label>
				<form:input path="etunimi" class="form-control" pattern=".{2,20}" 
										oninvalid="setCustomValidity('Etumimen tulee olla 2-20 merkkiä pitkä.')"
   										onchange="try{setCustomValidity('')}catch(e){}" required="required" />
				<form:label path="sukunimi">Sukunimi: </form:label>
				<form:input path="sukunimi" class="form-control" pattern=".{2,30}" 
										oninvalid="setCustomValidity('Sukunimen tulee olla 2-30 merkkiä pitkä.')"
   										onchange="try{setCustomValidity('')}catch(e){}" required="required" />
				<form:label path="sahkoposti">Sähköposti: </form:label>
				<form:input path="sahkoposti" class="form-control" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,63}$"
										oninvalid="setCustomValidity('Syötä sähköposti oikeassa muodossa (nimi@maili.com) ')"
   										onchange="try{setCustomValidity('')}catch(e){}" required="required" />
   				<form:label path="salasana">Salasana: </form:label>
   				<form:input path="salasana" type="password" class="form-control" required="required"/>
				<form:label path="kuvaus">Kuvaus: </form:label>
				<form:input path="kuvaus" class="form-control" rows="3" />
			</div>			
			<button type="submit" class="btn">Luo</button>
		</form:form>
	</div>
</body>
</html>

