<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login</title>

<link href="bootstrap.css" rel="stylesheet">
    <link href="ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="justified-nav.css" rel="stylesheet">
    <script src="ie-emulation-modes-warning.js"></script>

</head>


<body background="bgpic.png" style="background-size:cover; background-color:#cccccc;">

<div id="login" align="right">
	<a href="Register.jsp">Register</a>
</div>

 <div class="container"><!-- main body div -->
		<div class="masthead" align="center">
        <a href="index.jsp"><h1 class="text-muted" style="color:#151B54"><b>Electronics</b></h1></a>
        <nav style="background-color: lightgrey">
          <ul class="nav nav-justified">
            <li class="active"><a href="index.jsp">Home</a></li>
            <li><a href="about.jsp">About</a></li>
            <li><a href="contact.jsp">Contact</a></li>
          </ul>
        </nav>
      </div>


<div class="welcome" style="float:left; "> 
	<h1 style="color:black;background-color:white;">Welcome To Electronics!</h1>
</div>

	 <div class="row" align="center" >
        <div class="col-lg-4" style="padding:5px;margin-right:4px;border-radius: 25px;display;margin-left:3%">
          <p></p>
        </div>
        <div class="col-lg-4" style="border-radius: 25px;padding:5px;margin-right:5px;">
          <p></p>
       </div>
        <div class="col-lg-4" style="background-color:lightgrey; border-radius: 25px;padding:5px;margin-right:4px; float:right;">
          	<%@ page import="java.sql.*"%>
			<%@ page import="javax.sql.*"%>
	<%
	String username=request.getParameter("username"); 
	session.putValue("username",username); 
	String password=request.getParameter("password"); 
	Class.forName("com.mysql.jdbc.Driver"); 
	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","root"); 
	Statement st= con.createStatement(); 
	ResultSet rs=st.executeQuery("select * from administrator where username='"+username+"'"); 
	if(rs.next()){ 
	if(rs.getString(2).equals(password)){ 
			out.println("welcome"+username); 
		} 
	else { 
			out.println("Invalid password try again" + "  "); 
		 }	 
	} 
	
	%> 
        </div>
		
      </div><br>
		
	  
	  <br><br><br>
      <!-- Site footer -->
<div>
      <footer class="footer" style="background-color: lightgrey; padding:0px; bottom: 0; margin: 0 auto; position: absolute; width:80%;">
        <p align="center">&copy; 2017 Electronics, Maris Saukans , C12335876 , <a href="mailto:c12335876@mydit.ie?Subject=Hello%20"
		target="_top">C12335876@mydit.ie</a></p>
      </footer>
	</div>
	</div> <!--end body container div-->

		
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>