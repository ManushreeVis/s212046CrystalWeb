<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style/AdminLogin.css">
<title>Admin Login</title>
</head>
<body>
	<div class="body">
		<div class="layer">
			<div class="form">
				<div class="login-form">
					<div class="heading">Admin Login</div>
					<div class="input-box">
						<form action="AdminLoginCheck" method="post">
							<input type="text" class="input" placeholder="Username" name="username" required> <input type="password" class="input" placeholder="Password" name="passwd" required> 
							<input type="submit" class="submit" value="login">
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>


