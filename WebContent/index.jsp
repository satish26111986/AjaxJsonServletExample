<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="js/jquery-1.11.1.js" type="text/javascript"></script>
<script>
$(document).ready(function() {

$('#state').change(function(event) {
        var states = $("select#state").val();
        $.get('Controller', {
                stateName : states
        }, function(response) {

        var select = $('#district');
        select.find('option').remove();
          $.each(response, function(index, value) {
          $('<option>').val(value).text(value).appendTo(select);
      });
        });
        });
});
</script>

<body>

<form action="satish.do" method="post">  
Name:<input type="text" name="name"><br>  
Password:<input type="password" name="password"><br> 
<input type="submit" value="Get States"> 
	Select Your State:
	<select id="state">
	<option>Select State</option>
	<option value="Haryana">Haryana</option>
		<%-- <c:forEach var="item" items="${DropDown}">
		<option value="${item}">${item}</option>
		</c:forEach> --%>
	</select>
	<br /> <br /> 
	Select Your District:
	<select id="district">
		
	</select>
	 
</form> 

</body>
</html>