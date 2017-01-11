<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@page isELIgnored="false" %>
<%@ include file="header.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<!-- <title>Media Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style><script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> -->
	
</head>
<body>


<h3 align="center">ProductList</h3>

<div ng-app="app">
	<table class="tg" align="center">
	<tr>
		<th width="80" style="text-align:center;font-weight:bold;">Image</th>
		<th width="80" style="text-align:center;font-weight:bold;">ID</th>
		<th width="120" style="text-align:center;font-weight:bold;">TITLE</th>
		<th width="120" style="text-align:center;font-weight:bold;">COMPANY</th>
		<th width="120" style="text-align:center;font-weight:bold;">DESIGNER</th>
		<th width="80" style="text-align:center;font-weight:bold;">PRICE</th>
		<security:authorize access="hasRole('ROLE_ADMIN')">
			<th width="90" style="text-align:center;font-weight:bold;">Edit</th>
			<th width="90" style="text-align:center;font-weight:bold;">Delete</th>
		</security:authorize>
	</tr>
	
	
		<tr>
			<td align="center"><img src="<c:url value='/resources/images/${id}.png' />" > </td>
			<td align="center">${productObj.id}</td>
			<td align="center">${productObj.title}</td>
			<td align="center">${productObj.publication}</td>
			<td align="center">${productObj.author}</td>
			<td align="center">${productObj.price}</td>
			<security:authorize access="hasRole('ROLE_ADMIN')">
				<td align="center"><a href="<c:url value='/admin/book/edit//${productObj.id}' />" ><span class="glyphicon glyphicon-edit"></span>&nbsp;Edit</a></td>
				<td align="center"><a href="<c:url value='/remove/${productObj.id}' />" ><span class="glyphicon glyphicon-trash"></span>&nbsp;Delete</a></td>
			</security:authorize>
		</tr>
		<tr></tr>
		<tr>
			<td>
				<div ng-controller="myController">
					<security:authorize access="hasRole('ROLE_USER')">
						<a href="#" ng-click="addToCart(${productObj.id})" class="btnbtn-warning btn-large"><span class="glyphicon glyphicon-shopping-cart"></span></a>
					</security:authorize>
					
				</div>
			</td>
			<td><a href="<c:url value='/productListAngular'/>"><b>Back</a> </td>
		</tr>
	
	</table>
</div>
		<script src="<c:url value="/resources/js/controller.js"/>"></script>
		
		
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