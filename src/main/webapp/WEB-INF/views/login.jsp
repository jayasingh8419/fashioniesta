<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/views/header.jsp" %>
<html>
<%-- <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${registrationSuccess !=null}">
${registrationSuccess }
</c:if>
<c:if test="${logout!=null }">
${logout }
</c:if>
<form name="loginForm" method="post" action="j_spring_security_check">
<c:if test="${not empty error }">
${error }
</c:if>
Enter Username <input type="text" name="j_username"/>
Enter password <input type="password" name="j_password"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>
 --%>


<div class="container-wrapper">
						<div class="container">
							<div id="login-box">
							<h2>Login with Username and Password</h2>

							<c:if test="${not empty logout}">
								<div class="error" style="color: #ff0000;">${logout}</div>
							</c:if>

							<form name="loginForm" action="<c:url value='perform_login'/>" method="post"> 
			
							
								<c:if test="${not empty error}">
									<div class="error" style="color: #ff0000;">${error}</div>
								</c:if>
								
								
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
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
								
								
							</div>
							</form>
							</div>
						</div>
					</div>
					
				
					
					
						
</body>
</html>














<%-- <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<link href="resources/cascade.css" rel="stylesheet">
</head>
<body>

<div id="login-box">

		<h3>Login with Username and Password</h3>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
			action="<c:url value='perform_login' />" method='POST'>

			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='username'></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password' /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit"
						value="submit" /></td>
				</tr>
			</table>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

		</form>
	</div>
</body>
</html>





<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ page isELIgnored="false" %>
<div class="container-wrapper">
    <div class="container">
        <div id="login-box">
            <h2>Login with Username and Password</h2>

            <c:if test="${not empty logout}">
                <div class="error" style="color: #ff0000;">${logout}</div>
            </c:if>
            <form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">User: </label>
                    <input type="text" id="username" name="j_username" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="j_password" class="form-control" />
                </div>
                <input type="submit" value="Submit" class="btn btn-default">
            </form>
        </div>
    </div>
</div>
 --%>