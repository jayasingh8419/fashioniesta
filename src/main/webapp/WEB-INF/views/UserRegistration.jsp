<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width , initial-scale-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Registration Form</title>
<link rel="stylsheet" type="text/css" href="<c:url value="/resources/css/style.css"></c:url>">
</head>
<body>





			<div class="container">
			<c:url value="/customer/registration"  var="url"></c:url>
            <form:form action="${url}" class="form-horizontal" method="post" commandName="customer">
            
                <h2>Registration Form</h2>
                
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Full Name</label>
                    <font color = "red"><form:errors path="customerName" cssclass="error" ></form:errors></font>
                    <div class="col-sm-9">
                        <form:input path="customerName" class="form-control"></form:input>
                        <span class="help-block">Last Name, First Name, eg.: Smith, Harry</span>
                    </div>
                </div>
               
                
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                   <font color="red"><form:errors path="customerEmail" cssClass="error"></form:errors></font>
                    <div class="col-sm-9">
                        <form:input path="customerEmail" class="form-control"></form:input>
                    </div>
                </div>
                
                <div class="form-group">
						<c:if test="${DuplicateEmail !=null}">
							<label for="message" style="color:green">${DuplicateEmail }</label>
						</c:if>
								
								
				</div>
                
                <div class="form-group">
                    <label for="phone" class="col-sm-3 control-label">Phone</label>
                   <font color="red"><form:errors path="customerPhone" cssClass="error" ></form:errors></font> 
                    <div class="col-sm-9">
                        <form:input path="customerPhone"  class="form-control"></form:input>
                    </div>
                    
                </div>
                <div class="form-group">
                    <label for="username" class="col-sm-3 control-label">UserName</label>
                    <form:errors path="users.username" cssClass="error"></form:errors>
                    <div class="col-sm-9">
                        <form:input path="users.username" class="form-control"></form:input>
                    </div>
                </div>
                
                <div class="form-group">
						<c:if test="${DuplicateUName !=null}">
							<label for="message" style="color:green">${DuplicateUName }</label>
						</c:if>
								
								
				</div>
                
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <form:errors path="users.password" cssClass="error"></form:errors>
                    <div class="col-sm-9">
                       	<form:input path="users.password" type="password" class="form-control" /> 
                    </div>
       
   </div></form:form></div>
        <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</
