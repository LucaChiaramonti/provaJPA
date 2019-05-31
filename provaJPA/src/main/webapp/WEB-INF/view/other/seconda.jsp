<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<td>Nome studente</td>
		<td>Cognome studente</td>
	
	 <c:forEach items="${studenti}" var="studente">
	    <tr>
	    <td>${studente.getNome()}</td>
	    <td> ${studente.getCognome()}</td>
	    </tr>
	</c:forEach>
	</tr>
</body>	
</html>