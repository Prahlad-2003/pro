<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Products</title>
</head>
<body>
<div class="container">

${message}
<h4>List of available Products</h4>
<div class="table-responsive">
<form:form method="post" action="updateProducts" modelAttribute="product"> 
<table class="table table-hover table-condensed" >
 <thead>
	<tr>
	    <th>S.No</th>
		<th>Id</th>
		<th>Name</th>
		
	</tr>
 </thead>
 <tbody>
	<c:forEach items="${productList}" var="product" varStatus="status">
		<tr>
			<!-- <td align="center">${status.count}</td> -->
			
			<td >${status.count}</td> 
			
			<!--  <td><input name="productList[${status.index}].id" readonly="readonly" value="${product.id}"/></td> -->
			
			<td>${product.id}</td>
			
			<!-- <td><input name="productList[${status.index}].name" readonly="readonly" value="${product.name}"/></td> -->
			
			<td>${product.name}</td>
			
			
		</tr>
	</c:forEach>
 </tbody>
</table>

</form:form>
</div>
</div>
</body>
</html>