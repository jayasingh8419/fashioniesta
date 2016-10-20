<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
 <head>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" 
href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" 
src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" 
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</head>

<body>

<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>

 <table id="myTable" class="table table-striped" >  
<!--  <table id="myTable">  -->
        <thead>  
          <tr>  
            <th>Product ID</th>  
            <th>Product Name</th>  
            <th>Status</th>  
            <th>Description</th>  
            <th>Price</th>  
            <th>Category</th>  
          </tr>  
        </thead>  
        <tbody>  
        
        
         <c:forEach items="${listofProducts}" var="element">
          <tr>  
            <td>${element.id}</td>  
            <td>${element.name}</td> 
            <td>${element.category}</td>
           	<td>${element.price}</td>   
             <td>${element.description}</td>  
             <td>${element.status}</td>
           </tr>  
 	</c:forEach>
        </tbody>  
        </tbody>  
      </table>
      <script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>
                   
</body>
</html>
