<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style type="text/css" >
.form-signin {
	width: 280px;
	left:100px
	display: inline;
}
</style>
</head>
<body>
</br></br></br></br></br></br></br></br></br>
<div id="reg" class="container" >
  <center><h3 id="registerForm_header">Login as Admin</h2></center>
		<center><form class="form-signin" id=rForm action = "adminLogin" method="post">
			<input type="text" class="form-control" name="username"
				placeholder="User Name" required="" autofocus="" id="username"/>
			<input type="password" class="form-control" name="password"
				placeholder="Password" required="" autofocus="" id="password"/>	
				</br>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
		</form></center>
		</div>
		</br></br></br></br></br></br></br></br></br></br></br></br></br></br>
</body>
</html>