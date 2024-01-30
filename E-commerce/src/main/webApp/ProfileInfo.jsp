<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<link rel="stylesheet" href="profileinfo.css">
</head>
<body>
<img id="logo" src="Products\logoimg.png" onclick="location.href='home'">
	<div class="container">
		<div class="left">
		<img src="Products\profile.png">
			<input id="button" type="button" value="Home"
				onclick="location.href='home'"> <input id="button"
				type="button" value="Login" onclick="location.href='Login.jsp'">
			<input id="button" type="button" value="Men"
				onclick="location.href='/men'"> <input id="button"
				type="button" value="Women" onclick="location.href='/women'">
		</div>
		<div class="right">
			<div class="info">
				<h1>ABOUT</h1>
				<br>
				<br>
				<div class="info_data">
					<div class="data">
						<h4>User Name :</h4>
						<p>dinga@123</p>
					</div>
					<div class="data">
						<h4>Mobile :</h4>
						<p>9090909090</p>
					</div>
				</div>
				<br> <br><br> 	 	 	
				<div class="info">
					<div class="info_data">
						<div class="data">
							<h4>Email :</h4>
							<p>dinga@123</p>
						</div>
						<div class="data">
							<h4>Password :</h4>
							<p>dingi</p>
						</div>
					</div>
				</div>
				<br> <br>
				<button class=logoutbut>LOGOUT</button>
			</div>
		</div>
	</div>
</body>
</html>