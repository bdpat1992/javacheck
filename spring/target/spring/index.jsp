


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC
	  "-//W3C//DTD HTML 4.01 Transitional//EN"
	  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<style>

.sidenav a {
  padding: 4px 4px 4px 32px; 
  text-decoration: none;
  font-size: 20px;
  color: #818181;
  display: block;
 
}

.sidenav a:hover {
   color:red;
   background-color:red;
   border-radius:50px;
   background-color:white
}</style>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<body style="background-color:#090002 ">
<div style="background-color:#FC042A;">
<center><h1>Janasena Party<h1></h1></center>
</div>	

<div style="color:red">
<center><h1><marquee behavior="scroll" direction="left">Breaking News...</marquee><h1></h1></center>
</div>

<div style="background-color:#FC042A;height:475px">

<div class="sidenav" style="width:10%;height:475px;background-color:black;color:red">
<a id="adminLogin" onClick="adminLogin" href="#"> Admin Login</a><br>
<a id="users" onClick="users()" href="#"> users</a><br>
<a id="postNews" href="#"> Post News</a><br>
<a id="nByConstancy" href="#"> News By Constancy</a><br>
<a id="nByDistric" href="#"> News by Distric</a><br>
 
 </div>
</div>
	
</body>

<script>
function users(){
	$.ajax({
		url:"http://localhost:8080/spring/usersList",
		dataType:"jsonp",
		success:function(resp){
			alert("success");
		},
		error:function(){
			alert("error");
		}
	})
}
</script>
</html>

