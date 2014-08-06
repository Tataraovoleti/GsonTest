<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	  $("#getDetails").click(function(){
	  $.ajax({
	   type : "GET",
	   url : "GsonServlet",
	   dataType: "json",
	   success: function(response){
		   
	    $("#empId").val(response.eId);
	    $("#employeeName").val(response.eName);
	    },
	   error : function(){
		  
	    }
	   
	   });
	  });
	 });

</script>
</head>
<body>

Employee Id : <input type="text" id="empId"></input><br/>
Employee Name : <input type="text" id="employeeName"></input><br/>

<input type="button" id="getDetails" value="GET VALUE"></input>


</body>
</html>