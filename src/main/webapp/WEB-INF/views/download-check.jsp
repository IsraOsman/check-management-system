<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Download Check</title>
    <link href="css/home.css" rel="stylesheet">
    <link href="css/sidebar.css" rel="stylesheet">
    <link href="css/micrenc.ttf" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/cf0060ff00.js" crossorigin="anonymous"></script>
</head>
<body>
	 <div class="container border mt-5  border-secondary width-100">
				        <div class="card  border-secondary mt-3 mb-3">
					        <div class="card-body">
					        	<div class="row">
					        		<div class="col">${cheque.account.name}</div>
					        		<div class="col"><h4>${cheque.account.bank}</h4></div>
					        		<div class="col">${cheque.chequeNumber}</div>
					        	</div>
					        	<div class="row">
					        		<div class="col"></div>
					        		<div class="col" align="center">Date: ${cheque.date}</div>
					        	</div>
					        	<div class="row">
					        		<div class="col-8 font-weight-light mr-2">Order of: ------------------------</div>
					        		<div class="col mt-2 font-weight-bold" align="right">$ <p class="border pr-2 pl-2 pt-1 pb-1 d-inline font-weight-normal">${cheque.amount}</p></div>
					        	</div>
					        	<div class="row">
					        		<div class="col-8">----------------------------------</div>
					        		<div class="col" align="center">Dollars</div>
					        	</div>
					        	<div class="row">
					        		<div class="col font-weight-light">Memo: ${cheque.memo}</div>
					        		<div class="col" align="center">Signature: -------</div>
					        	</div>
					        	<div class="row">
					        		<div class="col accNum">${cheque.account.accountNumber}</div>
					        		<div class="col accNum">${cheque.account.routingNumber}</div>
					        		<div class="col accNum">${cheque.chequeNumber}</div>
					        		<div class="col"></div>
					        	</div>
				            </div>
		        	    </div>
	</div>
</body>
</html>