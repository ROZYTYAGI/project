<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font color="red"> ${message}</font>
	<form action="/editAirport" method="POST">
	   <br/><br/>
	   Airport	Code : <input name="airportcode" type="text" readonly="true" value="${airport.airportcode}"/> 
		Airport Old name: <input name="airportname" type="text"/>
		Airport New name: <input name="airportnewname" type="text"/>
		
		
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>