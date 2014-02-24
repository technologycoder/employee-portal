<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">    

    <title>Sample site using Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="/css/style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<header>    


<div class="container">

    <div class="table-responsive">
    <table class="table table-striped table-bordered ">  
        <thead>  
          <tr>  
            <th>First Name</th>              
            <th>Last Name</th>  
            <th>Email</th>              
            <th>Phone Number</th>
            <th>Hire Date</th>              
            <th>Salary</th>
            <th>Commision %</th>
          </tr>  
        </thead>
        
        <tbody>         
        	<g:each in="${employees}" var="employee">
        		<tr>
    				<td>${employee.firstName}</td>
    				<td>${employee.lastName}</td>
    				<td>${employee.email}</td>
    				<td>${employee.phoneNumber}</td>
    				<td>${employee.hireDate}</td>
    				<td>${employee.salary}</td>
    				<td>${employee.commissionPct}</td>
    			</tr>
			</g:each>         
          
        </tbody>       
   </table>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>
