<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="trovaTutti" method="get">
		<input type="submit"  value="Stampa tutti">
	</form>
	<br>
	<hr>
	
	<form action="trovaPerNome" method="get">
		<input type="text" name="nome"> Inserici il  nome da cercare
		<input type="submit">
	</form>
	<hr>
	<br>
	<form action="trovaPerCognome" method="get">
		<input type="text" name="cognome">  Inserisci il cognome da cercare
		<input type="submit">
	</form>
	<hr>
	<br>	
		<hr>
	<br>
	<form action="aggiungiStudente" method="get">
	<input type="text" name="nome"> Inserici il  nome 
		<input type="text" name="cognome">  Inserisci il cognome 
		<input type="submit">
	</form>
	<hr>
	<br>
</body>
</html>