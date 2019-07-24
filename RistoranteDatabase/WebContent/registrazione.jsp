	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
<%@ page import="java.util.ArrayList" %> <!-- importo la libreria!! -->
</head>
<body>
<%
String nome=request.getParameter("nome");
if(nome==null){
	nome="";
}
String cognome=request.getParameter("cognome");
if(cognome==null){
	cognome="";
}
String username=request.getParameter("username");
if(username==null){
	username="";
}
String password=request.getParameter("password");
if(password==null){
	password="";
}

%>

<%
ArrayList<String> listaErrori=(ArrayList<String>) request.getAttribute("listaErrori");
if(listaErrori!=null){
	for(String s : listaErrori){%>
	
	<h1> <%=s %></h1>
		
<% 		
	}	
}
%> 
<% String[] asterischi={"","","",""};%>

<%if(request.getAttribute("asterischi")!=null){ 
asterischi=(String[])request.getAttribute("asterischi");}%>

<h1>Registrazione</h1>

<form name="FormRegistrazione" action="RegistrazioneUtente" method="post">
<label><br>Nome:<br></label> <input type="text" name="nome" value="<%=nome%>"></input> <span ><%=asterischi[0] %></span>
<label><br>Cognome:<br></label> <input type="text" name="cognome" value="<%=cognome%>"></input>  <span ><%=asterischi[1] %></span>
<label><br>Username:<br> </label><input type="text" name="username" value="<%=username%>"></input>  <span ><%=asterischi[2] %></span>
<label><br>Password:<br></label> <input type="text" name="password" value="<%=password%>"></input>  <span ><%=asterischi[3] %></span>
<br><br>
<input type="submit" value="invia"></input>
</form>
</body>
</html>