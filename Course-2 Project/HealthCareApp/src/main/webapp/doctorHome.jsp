<%@page import="java.util.Iterator"%>
<%@page import="com.healthcare.entity.Patient"%>
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
<h2>Doctor home Page</h2>
<table border="1">
	<tr>
		<th>PId</th>
		<th>Name</th>
		<th>Age</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Diagnosis</th>
		<th>Remark</th>
		<th>Gender</th>
		<th>Action</th>
	</tr>
	<%
		Object obj = session.getAttribute("patients");
		List<Patient> listOfPatient = (List<Patient>)obj;
		Iterator<Patient> li = listOfPatient.iterator();
		while(li.hasNext()){
			Patient p = li.next();
			%>
			<tr>
				<td><%=p.getPid()%> </td>
				<td><%=p.getName()%> </td>
				<td><%=p.getAge()%> </td>
				<td><%=p.getPemail()%> </td>
				<td><%=p.getPhone()%> </td>
				<td><%=p.getDiagnosis()%> </td>
				<td><%=p.getRemark()%> </td>
				<td><%=p.getGender()%> </td>
			</tr>
			<%
		}
	%>
</table>
<br/>
<a href="addPatient.jsp">Back</a>
</body>
</html>