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
				<form:input path="etunimi" class="form-control" />
				<form:label path="sukunimi">Sukunimi: </form:label>
				<form:input path="sukunimi" class="form-control" />
				<form:label path="sahkoposti">Sähköposti: </form:label>
				<form:input path="sahkoposti" class="form-control" />
				<form:label path="kuvaus">Kuvaus: </form:label>
				<form:input path="kuvaus" class="form-control" rows="3" />
			</div>
			<button type="submit" class="btn">Luo</button>
		</form:form>
	</div>
</body>
</html>