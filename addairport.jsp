<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#context
{
margin-left:400px;
margin-top:100px;
}
          

h1
{
margin-left: 450px;
font-size: 24;
font-style: normal;
}

h2
{
margin-left: 10px;
font-size: 30;
font-style: normal;
}

.button {
    background-color: #333; 
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	margin-right:400px;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

#font
{
    margin-right: 2.5em;
    font-family: "Times New Roman";
    font-size: 25px;
}

</style>

<body>

	   
<ul>
  <li><a class="active" href="#home">
  <h1>FLIGHT  TICKET  BOOKING  SYSTEM</h1>
  </a></li>
</ul>
<title>ADD AIRPORT</title>
<center>
<br><br><h2>ADD AIRPORT</h2>
</center>
<p><font color="red">${errorMessage}</font></p>
    <p><b><font color="green">${welcomeMessage}</font></b></p>
	<form action="/airport" method="POST">
	   <br/><br/>
<div id="context">

<div id="font">Airport City:<input type="text" name="airportcity", value="${airport.airportcity}"></h1><br><br>
<div id="font">Airport Code:<input type="text" name="airportcode",value="${airport.airportcode}"></h1><br><br>
<div id="font">Airport Name:<input type="text" name="airportname",value="${airport.airportname}"></h1><br><br>
</div>
<center><input type="submit" value="SUBMIT" class="button"></center>
<br>
		<a href="/airport">  AIRPORT LIST</a>
</body>

	</form>
</body>
</html>