<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h2>Health Logger</h2>
<h5>Add/Update Patient Information</h5>
<form action="PatientController" method="post" class="form-group">
	<input type="hidden" name="operation" value="add">
Name<br>
<input type="text" name="name" class="form-control"><br/>
Email<br>
<input type="text" name="pemail" class="form-control"><br/>
Phone<br>
<input type="text" name="phone" class="form-control"><br/>
Age<br>
<input type="text" name="age" class="form-control"><br/>
Diagnosis<br>
<textarea name="diagnosis" rows="1" cols="50"></textarea><br/>
Remark<br>
<textarea name="remark" rows="4" cols="50"></textarea><br/>
Gender<br>
<input type="radio" name="gender" value="Male">Male<br/>
<input type="radio" name="gender" value="Female">Female<br/>
<br/>
<input type="submit" name="submit" value="submit" class="btn btn-success">
</form>
</div>
<br/>
<a href="manage.jsp">Back</a> |
<a href="doctorHome.jsp">Next</a>
</body>
</html>