<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Welcome</title>
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
		    <div class="wrapper1 justify-content-between">
			  	<div class="sidebar">
			  		<ul>
			  			<li><a href="${contextPath}/accounts"><i class="fas fa-file-invoice"></i>Bank Accounts</a></li>
			  			<li><a href="${contextPath}/payee-list"><i class="fas fa-list-ul"></i>Payees</a></li>
			  			<li><a href="${contextPath}/write-check"><i class="fas fa-money-check"></i>Write and Print Checks</a></li>
			  			<li><a href="#"><i class="fas fa-user-cog"></i>Account Setting</a></li>
			  		</ul>
			  	</div>
			  	<div class="ml-5 w-75">
				    <c:if test="${pageContext.request.userPrincipal.name != null}">
				        <form id="logoutForm" method="POST" action="${contextPath}/logout">
				            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				        </form>
				
				        <h2>Write a Check | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
			        </c:if>
			                
						              
 			        <form:form action="saveCheque" modelAttribute="cheque"> 
 			            <table border="0" cellpadding="5">
 			             	<tr> 
		                        <td>Add Payee: </td>
			                    <td> 
				                    <form:select  path="payee">
				                       <c:forEach items="${payeeList}" var="payee" >
				                        	<form:option  value="${payee}">${payee.id} ${payee.payeeName}</form:option>
				                        </c:forEach>
				                    </form:select> 
			                    </td> 
			                </tr> 
			              	<tr> 
		                        <td>Bank Account: </td>
			                    <td> 
				                    <form:select  path="account">
				                       <c:forEach items="${accountList}" var="account" >
				                        	<form:option  value="${account}">${account.accountNumber} ${account.name}</form:option>
				                        </c:forEach>
				                    </form:select> 
			                    </td> 
			                </tr> 
 			               
 			                 <tr>
 			                    <td>Memo: </td> 
 			                    <td><form:input path="memo" /></td>
 			                </tr>
 			                 <tr>
 			                    <td>Amount: </td> 
 			                    <td><form:input  path="amount" /></td>
 			                </tr>
			                 <tr>
 			                    <td>Id</td> 
 			                    <td><form:input  path="chequeNumber" /></td>
 			                </tr>    
 			                
 			            </table> 
 			            <input type="submit" value="Save"  class="text-white rounded bg-secondary pl-4 pr-4">
 			        </form:form>
  					<div class="mt-4"><a class="text-white rounded bg-secondary pt-2 pb-2 pl-4 pr-4" href="cheques">View Checks History</a></div>
		        </div>

		  </div>
	  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>