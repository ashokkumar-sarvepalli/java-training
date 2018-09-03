<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="market.data.object.Item"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Isnsert title here</title>
</head>
<body bgcolor="yellow">

	<%
		Item item = (Item) request.getAttribute("item");
	%>
	<font color="brown" size="18">
		<table border="2">
			<tr>
			<th>ItemCode</th>
			<th>ItemName</th>
			<th>ItemPrice</th>
			</tr>
			<tr>
				<td><%=item.getCode()%></td>
				<td><%=item.getName()%></td>
				<td><%=item.getPrice()%></td>
			</tr>
		</table>
		</font>
</body>
</html>