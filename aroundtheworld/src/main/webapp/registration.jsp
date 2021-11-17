<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h2 style = "text-align:center">Around The World</h2>
	<div class="container">
		<div class="regbox box">
			<img class="avatar" src="img/Worldy.png">
			<h1>Register Account</h1>
			<form action="RegisterServlet" method="post">
				<p>Username</p>
				<input type="text" placeholder="username" name="name" required>
				<p>Email</p>
				<input type="text" placeholder="email" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="password" name="password"required> 
				<input type="submit" value="Register"> 
					<a href="index.jsp"><h3>Already have an Account?</h3></a>
			</form>
		</div>
	</div>
</body>
</html>