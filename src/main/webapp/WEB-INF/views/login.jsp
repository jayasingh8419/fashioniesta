<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width , initial-scale-1">
<title>fashioniesta</title>

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
		
					<div class="container-wrapper">
						<div class="container">
							<div id="login-box">
							<h2>Login with Username and Password</h2>

							<c:if test="${not empty logout}">
								<div class="error" style="color: #ff0000;">${logout}</div>
							</c:if>

							<form name="loginForm" action="<c:url value='/perform_login'/>" method="post">

								<c:if test="${not empty error}">
									<div class="error" style="color: #ff0000;">${error}</div>
								</c:if>
								
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

							<div class="form-group">
								<label for="username">User: </label>
								<input type="text" id="username" name="username" class="form-control"/>
							</div>

							<div class="form-group">
								<label for="password">Password:</label>
								<input type="password" id="password" name="password" class="form-control"/>
							</div>

								<input type="submit" value="Submit" class="btn btn-default">
								<div class="form-group">
								<c:if test="${registrationSuccess !=null}">
										<label for="message" style="color:green">${registrationSuccess }</label>
								</c:if>
								
								
							</div>
							</form>
							</div>
						</div>
					</div>
					
					
										<!-- Footer -->
						<footer>
							<div class="row">
								<div class="col-lg-12">
								<p align="center">Copyright &copy; <a href="#">fashioniesta.com</a> 2016</p>
								</div>
							</div>
						</footer>
					</div>
					
					
						
</body>
</html>