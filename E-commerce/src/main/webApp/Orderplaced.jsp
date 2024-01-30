<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Status</title>
<style type="text/css">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Spartan", sans-serif;
}
h1 {
  font-size: 50px;
  line-height: 64px;
  color: #222;
}

h2 {
  font-size: 46px;
  line-height: 54px;
  color: #222;
}

h4 {
  font-size: 20px;
  color: #222;
}

h6 {
  font-weight: 700;
  font-size: 12px;
}

p {
  font-size: 16px;
  color: #465b52;
  margin: 15px 0 20px 0;
}

.section-p1 {
  padding: 40px 80px;
}

.section-m1 {
  margin: 40px 0;
}

body {
  width: 100%;
}
button {
	width: 40px;
	height: 40px;
	margin-left:200px;
}
.logo{
	padding-left: 0px;
	width: 100px;
	height: 60px;
}
#header{
	display: flex;
	align-items: center;
	justify-content: space-between;
	padding: 20px 70px;
	background-color: #E3E6F3;
	box-shadow: 0 5px 15px rgba(0red,0 green,0 blue, 0.06);
	z-index: 999;
	position: sticky;
	top: 0;
	left: 0;
}
#navbar{
	display: flex;
	align-items: center;
	justify-content: center;
}
#navbar li{
	list-style:none ;
	padding: 0px 20px;
	position: relative;
}
#cart{
	width: 30px;
	height: 30px;
}
#profile{
	width: 27px;
	height: 27px
}
#search{
	height: 25px;
	width: 27px;
}
#navbar li a{
	text-decoration: none;
	font-size: 16px;
	font-weight: 600;
	color: black;
	transition: 0.3s ease;
}
#navbar li a:hover,
#navbar li a:active{
	color: blue;
}
#navbar li a:active::after,
#navbar li a:hover::after{
	content: "";
	width: 50%;
	height: 2px;
	background: blue ;
	position: absolute;
	bottom: -4px;
	left: 20px;
}
#box{
	height: 30px;
	display: flex;
	cursor: pointer;
	padding: 10px 10px;
	background-color:#E3E6F3;
	border-radius: 30px;
	align-items: center;
	box-shadow: 0 10px 25px rgb(0, 0, 0,0.03);
	
}
#box:hover{
	box-shadow: 2px 2px 15px 4px rgba(0,0,0,0.45),
25px 0px 20px -20px rgba(0,0,0,0.45),
0px 25px 20px -20px rgba(0,0,0,0.45),
-25px 0px 20px -20px rgba(0,0,0,0.45);
}
#box:hover input{
	width: 200px;
}
#box input{
	width: 0;
	outline: none;
	border: none;
	font-weight: 500;
	transition: 0.8s;
	background: transparent;
}
.wrapper{
	width: 100%;
	height: 500px;
	font-size: 50px;
	font-weight: 900;
	background-image: linear-gradient(
  #bda5c5 0%,
  #bda5c5 20%,
  #a288b2 20%,
  #a288b2 40%,
  #876a9e 40%,
  #876a9e 60%,
  #6b4d8b 60%,
  #6b4d8b 80%,
  #553c9b 80%,
  #553c9b 100%
);
	color: yellow;
	text-align: center;
	padding-top: 100px;
	text-shadow: 2px 2px 5px red;
}
span {
	font-family:Courier, monospace;
	letter-spacing: 6px;
	
}
#finalbutton{
	background-color: initial;
	background-image: linear-gradient(-180deg, #FF7E31, #E62C03);
	border-radius: 6px;
	box-shadow: rgba(0, 0, 0, 0.3) 0 2px 4px;
	color: #FFFFFF;
	cursor: pointer;
	display: inline-block;
	font-family: Inter, -apple-system, system-ui, Roboto, "Helvetica Neue",
		Arial, sans-serif;
	height: 40px;
	line-height: 40px;
	outline: 0;
	overflow: hidden;
	padding: 0 20px;
	pointer-events: auto;
	position: relative;
	text-align: center;
	touch-action: manipulation;
	user-select: none;
	-webkit-user-select: none;
	vertical-align: top;
	white-space: nowrap;
	width: 100%;
	z-index: 9;
	border: 0;
	transition: box-shadow .2s;
	width: 18%;
	font-weight: 700;
	letter-spacing: 1px;
	margin-top: 60px;
	font-size: 17px;
}
#finalbutton:hover {
	box-shadow: rgba(253, 76, 0, 0.5) 0 3px 8px;
	background-color: white;
	color: black;
}
</style>
</head>
<body>
	<section id="header">
		<a href="#"><img src="Products\logoimg.png" class="logo" onclick="location.href='home'"></a>
		<div>
			<ul id="navbar">
				<li><a href="home">Home</a></li>
				<li><a href="/men">Men</a></li>
				<li><a href="/women">Women</a></li>
				<li><div id="box"><input type="text" placeholder="Search....."><img id="search" src="Products\search.png"></div></li>
				<li><a href="/CheckInfo"><img id="profile"
						src="Products\profile.png"></a></li>
				<li><a href="/displayCarts"><img id="cart" src="Products\cart-icon.png"></a></li>
			</ul>
		</div>
	</section>
	<section class="wrapper">
		<span>ORDER PLACED</span>
		<form action="home">
		<input id="finalbutton" type="submit" value="Continue Shopping"></form>
	</section>
</body>
</html>