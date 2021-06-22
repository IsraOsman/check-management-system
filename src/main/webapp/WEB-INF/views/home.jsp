<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Management System</title>

<link href="css/home.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
		<div class="container">
            <div class="header" >
                <header class="header_head">
                    <img href="${contextPath}/home" src="css/logo1.png" alt="logo">
                </header>

                <div class="dropdown">
                    <button id="btnColor" class="btn btn-secondary dropdown-toggle mb-1" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Menu
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item  font-weight-bold" href="${contextPath}/"> Home</a>
                        <a class="dropdown-item font-weight-bold" href="${contextPath}/registration">Sign Up</a>
                        <a class="dropdown-item font-weight-bold" href="${contextPath}/login">Login</a>
                    </div>
                    </div>
             </div>
             <div class="d-flex justify-content-between">
		  			<div  >
			            <p class="intro" >Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas mi massa, faucibus at mauris eu, eleifend cursus sapien. Nullam pretium sed arcu eget scelerisque.</p>
			            <a class="bttn mt-1" href="${contextPath}/registration">Sign up Today</a>
		            </div>
		             <div class="d-inline mb-2">
		            	 <img src="css/app-background.jpg" class="home-page-img">
		            </div>
	         
           	</div>
            
        </div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://unpkg.com/ionicons@5.5.1/dist/ionicons.js"></script>

   
</body>


</html>