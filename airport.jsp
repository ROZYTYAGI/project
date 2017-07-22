<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
	<p><font color="red">${errorMessage}</font></p>
    <p><b><font color="green">${welcomeMessage}</font></b></p>
    
	<table border="1" cellpadding="5" cellspacing="5">
	<th>Airport city</th><th>Airport code</th><th>Airport name</th><th></th>
	<c:forEach items="${airport}" var="airport"> 	
		<tr><td><c:out value="${airport.airportcity}"/></td>
		<td><c:out value="${airport.airportcode}"/></td>
			<td><c:out value="${airport.airportname}"/></td>
			<td><a href=editAirport?airportcode=<c:out value="${airport.airportcode}"/>>Edit</a>&nbsp;&nbsp;&nbsp;
		<a href=deleteAirport?airportcode=<c:out value="${airport.airportcode}"/>>Delete</a></td></tr>
	</c:forEach>
	</table>
    <br>
    <a href="/addAirport"><p>ADD AIRPORT</p></a>
    <a href="/hello"><p></p></a>
</body>
</html>
