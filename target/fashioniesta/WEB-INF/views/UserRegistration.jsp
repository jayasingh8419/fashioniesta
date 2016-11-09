<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@ page isELIgnored="false"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Register User</h1>

			<p class="lead">Please fill in your information below:</p>
		</div>
		<c:url value="/registration" var="url"></c:url>
		<form:form action="${url }" method="post" commandName="customer">

			<h3>Basic Info:</h3>

			<div class="form-group">
				<label for="name">Name</label>
				<!--  displaying the error msg -->
				<form:errors path="name" cssStyle="color: #ff0000" />
				<form:input path="name" class="form-Control" />
			</div>
			<c:if test="${duplicateEmail!=null }">
        ${duplicateEmail }
        </c:if>
			<div class="form-group">
				<label for="email">Email</label>

				<form:errors path="email" cssStyle="color: #ff0000" />
				<form:input path="email" class="form-Control" />
			</div>

			<div class="form-group">
				<label for="phone">Phone</label>
				<form:input path="phone" class="form-Control" />
			</div>
			<c:if test="${duplicateUname!=null }">
       			 ${duplicateUname }
            </c:if>
			<div class="form-group">

				<label for="username">Username</label>
				<form:errors path="username" cssStyle="color: #ff0000" />
				<form:input path="username" class="form-Control" />
			</div>

			<div class="form-group">
				<label for="password">Password</label>
				<form:errors path="password" cssStyle="color: #ff0000" />
				<form:password path="password" class="form-Control" />
			</div>


			<br />

			
			<input type="submit" value="submit" class="btn btn-default">
			<a href="<c:url value="/" />" class="btn btn-default">Cancel</a>

		</form:form>
 </div>
 </div>
 