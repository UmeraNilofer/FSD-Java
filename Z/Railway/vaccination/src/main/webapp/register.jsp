<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register - Vaccination Project</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="/register" method="post" class="form-group">
<label>UserName</label>
<input type="text" name="username" class="form-control"><br>
<label>EmailId</label>
<input type="email" name="email" class="form-control"><br>
<label>Password</label>
<input type="password" name="password" class="form-control"><br>
<button type="submit" class="btn btn-primary">Register</button><br>
Already have an account? <a href="/">Login here</a>
</form>
</body>
</html>