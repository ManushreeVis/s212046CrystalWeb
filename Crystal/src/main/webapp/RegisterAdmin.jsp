<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style/AdminLogin.css">
<title>Register Admin Member</title>
</head>
<body>
	<div class="body">
		<div class="layer">
			<div class="form">
				<div class="login-form">
					<div class="heading">Register Member</div>
					<div class="input-box">
						<form action="RegisterAdmin" method="post">
							<input type="text" class="input" placeholder="First Name"
								name="fname" required>
								<input type="text" class="input" placeholder="Last Name"
								name="lname" required>
							<input type="text" class="input" placeholder="Username"
								name="username" required> <input type="password"
								class="input" placeholder="Password" name="passwd" required>
							<input type="password" class="input"
								placeholder="Retype Password" name="cpasswd" required>

							<input type="text" class="input" placeholder="Gender [M/F]"
								name="gender" required>	
							<input type="email" class="input" placeholder="Email"
								name="email" required>
							<input type="text" class="input" placeholder="Mobile Number"
								name="mobno" required>	
							
	<textarea class="input"  name="adminaddress" cols="20" rows="1" placeholder="Address"></textarea>
							<input type="submit" class="submit" value="register">
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>


