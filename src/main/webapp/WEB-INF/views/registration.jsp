<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Create an account</title>
      <link href="css/home.css" rel="stylesheet">
       <link href="css/signup.css" rel="stylesheet">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </head>

  <body>
    <div class="container">
    	 <div class="header" >
        	 <header class="header_head">
                <img src="css/logo1.png" href="${contextPath}/home" alt="logo">
                </header>
                <div class="dropdown">
                    <button Style="background-color: rgba(101, 44, 175, 0.911);" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Menu
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item font-weight-bold" href="${contextPath}/">Home</a>
                        <a class="dropdown-item font-weight-bold" href="${contextPath}/registration">Sign Up</a>
                        <a class="dropdown-item font-weight-bold" href="${contextPath}/login">Login</a>
                    </div>
                 </div>
           </div>
           <div class="custom-form">   
	           <form:form method="POST" modelAttribute="userForm" class="form-signin">
		            <h2 class="form-signin-heading" id="page-title">Create an Account </h2>
		            <spring:bind path="username">
		                <div class="form-group text-danger mt-2 font-weight-normal ${status.error ? 'has-error' : ''}">
		                    <form:input type="text" path="username" class="form-control" placeholder="Username"
		                                autofocus="true"></form:input>
		                    <form:errors path="username"></form:errors>
		                </div>
		            </spring:bind>
		
		            <spring:bind path="password">
		                <div class="form-group text-danger mt-2 font-weight-normal ${status.error ? 'has-error' : ''}">
		                    <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
		                    <form:errors path="password"></form:errors>
		                </div>
		            </spring:bind>
		
		            <spring:bind path="passwordConfirm">
		                <div class="form-group text-danger mt-2 font-weight-normal ${status.error ? 'has-error' : ''}">
		                    <form:input type="password" path="passwordConfirm" class="form-control"
		                                placeholder="Confirm your password"></form:input>
		                    <form:errors path="passwordConfirm"></form:errors>
		                </div>
		            </spring:bind>
	
	            <button class="btn1" type="submit">Submit</button>
	        </form:form>
	     </div>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>