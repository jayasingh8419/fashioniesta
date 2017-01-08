<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<ul class="nav navbar-nav ">
			<li><a href="<c:url value="/home"/>">Home</a></li>
			<li><a href="<c:url value="/about"/>">About us</a></li>
			
			<!--  User has logged in  -->
		<c:if test="${pageContext.request.userPrincipal.name!=null}" >
		<security:authorize ifAnyGranted="ROLE_ADMIN">
				<li><a href="<c:url value="/admin/book/addBook"/>">Add New
						Book</a></li>
		</security:authorize>
			<li><a href="<c:url value="/getAllBooks"/>">Browse All Books</a></li>		
			<li><a>Welcome ${pageContext.request.userPrincipal.name }</a></li>
			<li><a href="<c:url value="/j_spring_security_logout"></c:url>">logout</a></li>
		</c:if >
		
		<!--  when the user not logged in -->
		<c:if test="${pageContext.request.userPrincipal.name==null}">
		<li><a href="<c:url value="login"></c:url>">login</a></li>
		<li><a href="c:url value="Registration.jsp">Register</a>
		</c:if>
		</ul>
	</div>
	</nav>
</body>
</html>
















<!-- <html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<link href="resources/cascade.css" rel="stylesheet">
<style>
    /* Remove the navbar's default margin-bottom and rounded borders */
   body{ background: #6699FF;}
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
     
  #img
    {
    	height: 75px;
    	width: 100px;
    	margin-top:-11    
    	</style>
    	
    	</head>
    	<body>
    	
    	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
      <a class="navbar-brand" href="#">
       <img id="img" alt="abc" src="resources/logoo.JPG"></a>
       
       <img id="img" alt="abc" src="resources/images/logoo.JPG"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="aboutus">About</a></li>
        <li><a href="datatable">Products</a></li>
        <li><a href="contactus">Contact</a></li>
        <li><a href="stock"> Stock</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign up</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html> -->