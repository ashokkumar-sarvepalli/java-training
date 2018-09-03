<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="error.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="viewallpolicies" method="POST">
		Enter user name : <input type="text" value="" name="uname"> <br>
		Enter Password : <input type="password" value="" name="password">

		<input type="submit" value="View All Polices">

	</form>


	<%

 if(request.getAttribute("loginstatus")!=null){
 String loginStatus = (String) request.getAttribute("loginstatus");
   if(loginStatus.equalsIgnoreCase("failed")){
	   %>

	<p>
		<font color="red"> Invalid login check username or password</font>
	</p>
	<%
   }
 
 }
%>




</body>
</html>