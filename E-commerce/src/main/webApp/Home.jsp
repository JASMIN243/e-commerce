<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="Home.css"></link>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
<link>
</head>
<body>
	<section id="header">
		<a href="#"><img src="logoimg.png" class="logo"></a>
		<div>
			<ul id="navbar">
				<li><a href="Home.jsp">Home</a></li>
				<li><a href="MEN.jsp">Men</a></li>
				<li><a href="Women.jsp">Women</a></li>
				<li><a href="Signin.jsp">Sing In</a></li>
				<li><a href="Login.jsp"><img id="profile"
						src="profile.png"></a></li>
				<li><img id="search" src="search.png"></li>
				<li><a href="Cart.jsp"><img id="cart" src="cart-icon.png"></a></li>
			</ul>
		</div>
	</section>
	<section id=adv>
		<h4>Biggest Deals For You</h4>
		<h2>Super Value Deals</h2>
		<h1>On All Products</h1>
		<p>save more with coupons & up to 70% off!</p>
		<button>Shop Now</button>
	</section>
	<section id="feature">
		<div class="fe-box">
			<img alt="" src="\Feaatures\f1.png">
			<h6>Free Shipping</h6>
		</div>
		<div class="fe-box">
			<img alt="" src="\Feaatures\f2.png">
			<h6>Order Online</h6>
		</div>
		<div class="fe-box">
			<img alt="" src="\Feaatures\f3.png">
			<h6>Save Money</h6>
		</div>
		<div class="fe-box">
			<img alt="" src="\Feaatures\f4.png">
			<h6>Promotions</h6>
		</div>
		<div class="fe-box">
			<img alt="" src="\Feaatures\f5.png">
			<h6>Happy Sell</h6>
		</div>
		<div class="fe-box">
			<img alt="" src="\Feaatures\f6.png">
			<h6>F24/7 Support</h6>
		</div>
	</section>
	<section id="product1">
		<h2>Featured Products</h2>
		<p>Different Collecctions Of Different Models</p>
		<div id="pro-container">
			<div class="pro">

				<img src="Products\f1.jpg">
				<div id="des">
					<span>Adidas</span>
					<h5>Printed Shirt</h5>
					<h4>Rs999/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f2.jpg">
				<div id="des">
					<span>Adidas</span>
					<h5>Fancy Shirt</h5>
					<h4>Rs1999/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f3.jpg">
				<div id="des">
					<span>Timeless</span>
					<h5>Slimfit Shirt</h5>
					<h4>Rs550/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f7.jpg">
				<div id="des">
					<span>Rowdy</span>
					<h5>Womens Soft Peach Trouser</h5>
					<h4>Rs900/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f4.jpg">
				<div id="des">
					<span>Venom</span>
					<h5>Printed Shirt</h5>
					<h4>Rs1400/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f5.jpg">
				<div id="des">
					<span>Galaxy</span>
					<h5>Gray Shirt Cotton</h5>
					<h4>Rs2400/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f6.jpg">
				<div id="des">
					<span>Fireflies</span>
					<h5>Multi Color</h5>
					<h4>Rs1700/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
			<div class="pro">
				<img src="Products\f8.jpg">
				<div id="des">
					<span>Adidas</span>
					<h5>Printed Shirt</h5>
					<h4>Rs400/-</h4>
					<a href="#"><img src="cart-icon.png"></a>
				</div>
			</div>
		</div>
	</section>
	<section id="banner">
		<h4>Repair Services</h4>
		<h2>
			Up to<span>70% OFF</span>-All t-shirts & Accessories
		</h2>
		<button class="normal">Explore More</button>
	</section>
	<footer class="foot">
		<div class="col">
			<img src="logoimg.png">
			<h4>Contact Us</h4>
			<p>
				<strong>Address:</strong>Plot no 188,JNTU,Hyderabad
			</p>
			<p>
				<strong>Phone:</strong>+91 919133445566
			</p>
			<p>
				<strong>Hours:</strong>10:00 - 18:00, Mon - Sat
			</p>
		</div>
		<div class="follow">
			<h4>Follow Us</h4>
			<a href=""><img src="facebook.png"></a> <a href=""><img
				src="instagram.png"></a> <a href=""><img src="snap.png"></a>
			<a href=""><img src="youtube.png"></a> <a href=""><img
				src="twitter.png"></a>
		</div>
		<div class="col2">
			<h4>My Account</h4>
			<a href="#">Sing In</a> <a href="#">View Cart</a> <a href="#">My
				Wishlist</a> <a href="#">Track My Order</a> <a href="#">Help</a>
		</div>
		<div id="col3">
			<h4>Secured Payment Gateways</h4>
			<img src="pay.png">
		</div>
	</footer>
</body>
</html>