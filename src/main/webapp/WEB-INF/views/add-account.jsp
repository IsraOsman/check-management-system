<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>add-account</title>
    <link href="css/home.css" rel="stylesheet">
    <link href="css/sidebar.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/cf0060ff00.js" crossorigin="anonymous"></script>
</head>
<body>
	  <div class="container">
	  	<div class="header" >
	    	<header class="header_head">
	        	<img src="css/logo1.png" alt="logo">
	        </header>
	
	        <div class="dropdown">
	       		 <button Style="background-color: rgba(101, 44, 175, 0.911);" class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	                  Menu
	             </button>
	             <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
	             	<a class="dropdown-item font-weight-bold" href="${contextPath}/">Home</a>
	               	<a class="dropdown-item font-weight-bold" href="${contextPath}/welcome">Dashboard</a>
	             </div>
	         </div>
	    </div>
	    </div>
	    <div class="logic-page">
		    <div class="wrapper1">
			  	<div class="sidebar">
			  		<ul>
			  			<li><a href="${contextPath}/accounts"><i class="fas fa-file-invoice"></i>Bank Accounts</a></li>
			  			<li><a href="${contextPath}/payee-list"><i class="fas fa-list-ul"></i>Payees</a></li>
			  			<li><a href="${contextPath}/write-check"><i class="fas fa-money-check"></i>Write and Print Checks</a></li>
			  			<li><a href="#"><i class="fas fa-user-cog"></i>Account Setting</a></li>
			  		</ul>
			  	</div>
			  	<div class="ml-5">
				    <c:if test="${pageContext.request.userPrincipal.name != null}">
				        <form id="logoutForm" method="POST" action="${contextPath}/logout">
				            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				        </form>
				
				        <h2>Bank Accounts | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
			        </c:if>
			        
			        <div align="center">
					    <h4 class="mt-5"><a class="text-decoration-none" href="add-new-account">Add New Bank Account</a></h4>
					    <table border="2" cellpadding="5" class="mt-4">
					        <tr>
					        	<th class="pl-3 pr-3">Name</th>
					        	<th class="pl-3 pr-3">Bank</th>
					            <th class="pl-3 pr-3">Account Number</th>
					            <th class="pl-3 pr-3">Routing Number</th>
					            <th class="pl-3 pr-3">Date Added</th>
					            <th class="pl-3 pr-3">User Id</th>
					            <th class="pl-3 pr-3">Action</th>
					        </tr>
					        <c:forEach items="${listAccount}" var="account">
					        <tr>
					        	<td>${account.name}</td>
					        	 <td>${account.bank}</td>
					            <td>${account.accountNumber}</td>
					            <td>${account.routingNumber}</td>
					            <td>${account.date}</td>
					            <td align="center">${account.user.id}</td>
					            <td>
					                <a href="edit?id=${account.accountNumber}">Edit</a>
					                &nbsp;&nbsp;&nbsp;
					                <a href="delete?id=${account.accountNumber}">Delete</a>
					            </td>
					        </tr>
					        </c:forEach>
  						</table>
					</div>   
			        
		        </div>
		  	
		  </div>
	  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>