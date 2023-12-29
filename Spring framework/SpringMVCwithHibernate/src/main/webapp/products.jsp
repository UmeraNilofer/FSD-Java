<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}<br/>					<!-- Expression Language used to avoid null-->
<h2>Product Details</h2>
<form action="storeProduct" method="post">
<label>Product Name</label>
<input type="text" name="pname"/><br/>
<label>Price</label>
<input type="number" name="price"/><br/>
<label>URL</label>
<input type="url" name="url"/><br/>
<input type="submit" value="StoreProduct"/>
<input type="reset" value="Reset"/>
</form>
<hr>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Image URL</th>
		<th>Delete Product</th>
	</tr>
	<%
	Object obj = session.getAttribute("products");
	List<Product> list = (List<Product>)obj;
	Iterator<Product> ii = list.iterator();
	while(ii.hasNext()){
		Product p = ii.next();
		%>
		<tr>
			<td><%=p.getPid()%> </td>
			<td><%=p.getPname()%> </td>
			<td><%=p.getPrice()%> </td>
			<td><img src=<%=p.getUrl()%> width="100px" height="100px"/></td>
			<td>
		<a href="deleteProduct?pid=<%=p.getPid()%>">
			<img src="https://cdn-icons-png.flaticon.com/128/6861/6861362.png" 
			
			width="30px" height="30px"/>
				
		</a>
			</td>
		</tr>
		<% 
	}
	%>	
</table>
</body>
</html>