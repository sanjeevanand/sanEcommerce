
<%@taglib prefix="spring1" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
    <div class="container-wrapper">
    	<div class="container">
			<div class="page-header">
				<h1>All products</h1>
				<p class="lead">checkout all the product available now</p>
			    <table class="table table-striped table-hover">
			    	<thead>
			    	 <tr class="bg-success">
			    	  <th>photo</th>
			    	  <th>Product Name</th>
			    	  <th>Product Category</th>
			    	  <th>Product Conditon</th>
			    	  <th>Product Price</th><th></th>
			    	 </tr>
			    	</thead>
			    	<c:forEach items="${products}" var="product">
			    	
	                    <tr>
				    	  <th><img alt="image" src="#"/></th>
				    	  <th>${product.productName}</th>
				    	  <th>${product.productCategory}</th>
				    	  <th>${product.productCondition}/th>
				    	  <th>${product.productPrice} USD.</th>
				    	  <th><a href="<spring:url value="/productList/viewProduct/${product.productId}"/>"> <span class="glyphicon glyphicon-info-sign"></span></a></th>
				    	 </tr>
			    	 </c:forEach>
				</table>
			</div>
<%@include file="/WEB-INF/views/template/footer.jsp" %>      
	     
