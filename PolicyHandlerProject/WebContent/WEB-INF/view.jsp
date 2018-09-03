<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.util.List" %>
 <%@ page import="learning.policy.pojo.Policy" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<Policy> policyList = (List<Policy>)request.getAttribute("policylist");

%>
<font color="brown" size="18">
  <table border="2">
   <tr>
   <th>PolicyName</th>
   <th>term</th>
   <th>Premium</th>
   </tr>
   <%for(Policy pol : policyList) {%>
   <tr>
    <td><%=pol.getName()%></td>
    <td><%=pol.getTerm()%></td>
    <td><%=pol.getPremium()%></td>
   </tr>
   <%} %>
  </table>
  </font>

</body>
</html>