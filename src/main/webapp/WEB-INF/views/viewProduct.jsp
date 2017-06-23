
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp" %>
    <div class="container-wrapper">
    	<div class="container">
			<div class="page-header">
				<h1>product Details</h1>
				<p class="lead">Here is the details information about product details</p>
			    <div class="container">
			    	<div class="row">
				    	<div class="col-md-5"> 
				    	 <img alt="img" src="#" style="width:100% height: 300px"/>
				    	</div>
				    	<div class="col-md-5">
			    	      <h1>Product Name</h1>
			    	      <p>${product.productName}</p>
			    	      <p>${product.productCategory}</p>
			    	      <p>${product.productCondition}</p>
			    	      <p>${product.productPrice}</p>
			    	   </div>
			    	  <div>
			    	
			    	</div>
			    	</div>
			    </div>
			</div>
<%@include file="/WEB-INF/views/template/footer.jsp" %>      
	     
