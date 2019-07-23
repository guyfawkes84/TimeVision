<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
	<h1>Benvenuto!</h1>

	<form method="get" action="Dispatcher">
		<br>Nome<br> <input type="text" name="nome" placeholder="Inserire il nome" value=<%=request.getAttribute("nome")%>> 
			<br>Cognome<br><input type="text" name="cognome" placeholder="Inserire il cognome" value=<%=request.getAttribute("cognome")%>> 
			<br>Età<br><input type="text" name="cognome" placeholder="Inserire l'età" value=<%=request.getAttribute("eta")%>>
			<br>Username<br><input type="text" name="username" placeholder="Inserire la username" value=<%=request.getAttribute("username")%>>
		<br>Password<br> <input type="password" name="psw" placeholder="Inserire la password" value=<%=request.getAttribute("password")%>><br> <br> 
		<input type="submit" value="Registrazione"> <input type="reset" value="Reset">
	</form>
</body>
</html>