<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Registration</title>

</head>

<body background="bgpic.png" style="background-size:cover; background-color:#cccccc; ">

<div id="login" align="right">
	<a href="Login.jsp">login</a>
</div>

<div id="menu" align="center" style="padding-top:0.1cm;">
	<a href="index.jsp">Menu</a>
</div>

<div style="float:left; padding-left:1cm; padding-top:1cm;"> 
	<h1 style="color:black;background-color:white;">Welcome To Electronics!</h1>
</div>

<div  style="float:right; padding-right:2.5cm; padding-top:3cm; color:white !important;">
		<h2>Registration</h1>
		
	<form action="/action_page.php" >
  Username:<br>
  <input type="text" name="login" >
  <br>
  Password:<br>
  <input type="text" name="password">
  <br><br>
  <input type="submit" value="Submit">
	</form>
<p> Already have an account? Login <a href="Login.jsp"><button type="submit">Here</button></a></p>	
	</div>
	
	
</body>
</html>