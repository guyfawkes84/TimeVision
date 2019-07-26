<%@include file="/jspf/head.jspf" %>

<form action="Login" method="post">
<input type="text" name="username" placeholder="username">
<input type="text" name="password" placeholder="password">
<input type="submit" >



</form>
<c:choose>
<c:when test="${messaggio!=null}">
<h1> ${messaggio}</h1>
</c:when>
</c:choose>
</body>
</html>