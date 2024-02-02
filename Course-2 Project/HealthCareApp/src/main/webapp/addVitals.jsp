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
<h5>Add Patient's Vital Information</h5>
<form action="LoginController" method="post" class="form-group">
Select Patient<br>
<select name="cars" id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
<br/>
BP Low<br>
<input type="text" name="name" class="form-control"><br/>
BP High<br>
<input type="text" name="name" class="form-control"><br/>
SPO2<br>
<input type="text" name="name" class="form-control"><br/>
<br/>
<input type="submit" name="submit" value="submit" class="btn btn-success">
</form>
</div>
<br/>
<a href="manage.jsp">Back</a>
</body>
</html>