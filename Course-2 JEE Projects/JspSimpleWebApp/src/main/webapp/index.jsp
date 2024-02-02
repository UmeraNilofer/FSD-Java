<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to simple HTML Page</h2>
<%!int a,b,sum; %>
<%
a=30;
b=40;
sum=a+b;
System.out.println("Welcome to JSP on console");
out.println("Welcome to JSP on browser");
out.println("Sum of two numbers is "+sum);
out.println("<br/><font color=red> Sum of two numbers is "+sum+"</font>");
%>
<p>Sum of two numbers is <%=12+13 %> </p>
<font color="orange">Sum of <%=a %> and <%=b %> is <%=sum %></font>
<br/>
<a href="login.jsp">Login Page</a>
</body>
</html>