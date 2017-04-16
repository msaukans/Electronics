<html>
<head>
<title>Homepage</title>

	<link href="bootstrap.css" rel="stylesheet">
    <link href="ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="justified-nav.css" rel="stylesheet">
    <script src="ie-emulation-modes-warning.js"></script>
    
    <style> 
input[type=text] {
    width: 170px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('search.png');
     background-size: 25px 18px;
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 100%;
}
</style>
</head>
<body>

<div class="row" align="center" style="max-width:80%">
        <div class="col-lg-4" style="float:left; padding:0px;margin-right:4px;border-radius: 25px;display;margin-left:3%">
          <form action="search.jsp" method="post">
			<input  type="text"  name="search" placeholder="Search items" >
			<!-- <input type="submit" value="go"> -->
		</form>
        </div>
        <div class="col-lg-4" style="border-radius: 25px;padding:0px;margin-right:5px;">
          <p></p>
       </div>
        <div class="col-lg-4" style="float:right; border-radius: 25px;padding:0px;margin-right:0px;">
          
		<a href="Login.jsp" > Login </a> <a href="Register.jsp"> Register </a><a href="#"> Cart </a>
        </div>
      </div>
</div> 

 <div class="container">
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
	
		<br><br><br>

<div class="row" align="center" >
        <div class="col-lg-4" style="padding:5px;margin-right:4px;border-radius: 25px;display;margin-left:3%">
          <p></p>
        </div>
        <div class="col-lg-4" style="border-radius: 25px;padding:5px;margin-right:5px; min-width:85%;">
        <h1>Stock</h1>
           <%@ page import="java.sql.*"%>
			<%@ page import="javax.sql.*"%>
	<%
		Class.forName("com.mysql.jdbc.Driver"); 
		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics?autoReconnect=true&useSSL=false","root","root"); 
		Statement st= con.createStatement(); 
          
          ResultSet rs=st.executeQuery("SELECT id, brand, model, category, price, rating, stock FROM Item "); 
		while(rs.next()){
		//Retrieve by column name
        int id  = rs.getInt("id");
        String brand = rs.getString("brand");
        String model = rs.getString("model");
        String category = rs.getString("category");
        Double price = rs.getDouble("price");
		int rating = rs.getInt("rating");
		int stock = rs.getInt("stock");
        
        //Display values
        %><table><tr><td><%
        out.print(" ID: " + id + " ");%></td><th><%
        out.print(" Brand: " + brand + " ");%></th><th><%
        out.print("  Model: " + model + " ");%></th><th><%
        out.print("  Category: " + category + " ");%></th><th><%
        out.print(" Price: " + price + " ");%></th><th><%
        out.print("  Rating: " + rating + " ");%></th><th><%
        out.print("  Stock: " + stock + " ");%></th></tr></table><%
                
     }
	rs.close();
	%> 
       </div>
        <div class="col-lg-4" style=" border-radius: 25px;padding:5px;margin-right:4px;">
        	<p></p>
        </div>
		
      </div><br>
		
	  
	  <br><br><br>
      <!-- Site footer -->
<div>
      <footer class="footer" style="background-color: lightgrey; padding:0px; bottom: 0; margin: 0 auto; position: initial; width:80%;">
        <p align="center">&copy; 2017 Electronics, Maris Saukans , C12335876 , <a href="mailto:c12335876@mydit.ie?Subject=Hello%20"
		target="_top">C12335876@mydit.ie</a></p>
      </footer>
	</div>
	</div> <!--end body container div-->

		
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
