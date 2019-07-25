<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ordinazioni</title>
<%@ page import="java.util.ArrayList" %> <!-- importo la libreria!! -->
</head>
<body>
<h1>Ordinazioni</h1>
<%
int num_tavolo=Integer.parseInt(request.getParameter("num_tavolo"));
if(num_tavolo==0){
	num_tavolo=0;
}
int num_coperti=Integer.parseInt(request.getParameter("num_coperti"));

if(num_coperti==0){
	num_coperti=0;
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
<body>
<form action="ServletOrdinazioni" method="post">
<label><br>Numero tavolo:<br></label> <input type="text" name="num_tavolo" value="<%=num_tavolo%>"></input> <span ><%=asterischi[0] %></span>
<label><br>Numero di coperti:<br></label> <input type="text" name="num_coperti" value="<%=num_coperti%>"></input>  <span ><%=asterischi[1] %></span>
<br><br>
<input type="submit" value="invia"></input>
</form>
</body>
</html>