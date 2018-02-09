<!DOCTYPE HTML>
<!--
	Retrospect by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Book Appoinment - Jagdamba Pathology</title>
		<link rel="icon" href="C:\Users\DURGESH\Pictures\project\icon\1492883601_laboratory.ico">
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
	</head>
	<body>

		<!-- Header -->
			<header id="header" class="skel-layers-fixed">
				<h1><a href="Index.jsp">Jagdamba Pathology</a></h1>
				<a href="#nav">Menu</a>
			</header>

		<!-- Nav -->
			<nav id="nav">
				<ul class="links">
					<li><a href="Index.jsp">Home</a></li>
					<li><a href="About Us.jsp">About Us</a></li>
					<li><a href="Services.jsp">Services</a></li>
					<li><a href="Solutions.jsp">Solutions</a></li>
					<li><a href="Resources.jsp">Resources</a></li>
					<li><a href="Forum.jsp">Forum</a></li>
					<li><a href="Contact Us.jsp">Contact  Us</a></li>
					<li><a href="More.jsp">More</a></li>
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="container">
					<header class="major special">
						<h2>Book your appoinment, here!</h2>
						<p>Lorem ipsum dolor sit amet nullam id egestas urna aliquam</p>
					</header>

					<!-- Form -->
						<section>
						${msg}
							<form method="post" action="insertAppo">
								<div class="row uniform 50%">
								    <div class="12u$">
									    <input type="text" id="datetime12" placeholder="Appoinment Date :   DD / MM / YYYY     hh : mm AM/PM" name="datetime">
                    				</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="pName" id="name" value="" placeholder="Full Name" />
									</div>
									<div class="6u$ 12u$(xsmall)">
										<input type="email" name="email" id="email" value="" placeholder="Email ID" />
									</div>
									<div class="6u 12u$(xsmall)">
										<input type="text" name="pAddr" id="namer" value="" placeholder="Address " />
									</div>
									<div class="6u$ 12u$(xsmall)">
										<input type="text" name="pmobile" id="name" value="" placeholder="Mobile No." />
									</div>
									<div class="4u 12u$(xsmall)">
										<input type="radio" id="priority-low" name="priority" checked>
										<label for="priority-low">Male</label>
									</div>
									<div class="4u 12u$(xsmall)">
										<input type="radio" id="priority-normal" name="priority">
										<label for="priority-normal">Female</label>
									</div>
									<div class="4u$ 12u$(xsmall)">
										<input type="radio" id="priority-high" name="priority">
										<label for="priority-high">Other</label>
									</div>
									<!-- <div class="6u 12u$(small)">
										<input type="checkbox" id="copy" name="copy">
										<label for="copy">Email me a copy of this message</label>
									</div>
									<div class="6u$ 12u$(small)">
										<input type="checkbox" id="human" name="human" checked>
										<label for="human">I am a human and not a robot</label>
									</div> -->
									<div class="12u$">
										<textarea name="message" id="message" placeholder="Enter your message" rows="3"></textarea>
									</div>
									<div class="12u$">
									<center>
										<ul class="actions">
											<input type="submit" value="Book" class="special">
											<input type="reset" value="Reset">
										</center>	
										</ul>
									</div>
								</div>
							</form>
						</section>

	<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<ul class="icons">
						<li><a href="https://facebook.com/dkr51" class="icon fa-facebook">
							<span class="label">Facebook</span>
						</a></li>
						<li><a href="#" class="icon fa-twitter">
							<span class="label">Twitter</span>
						</a></li>
						<li><a href="#" class="icon fa-instagram">
							<span class="label">Instagram</span>
						</a></li>
						<li><a href="#" class="icon fa-linkedin">
							<span class="label">LinkedIn</span>
						</a></li>
					</ul>
					<ul class="copyright">
						<li>&copy; Untitled.</li>
						<li>Images: <a href="Index.html">xxxx</a>.</li>
						<li>Design: <a href="Index.html">xxxx</a>.</li>
					</ul>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="assets/js/main.js"></script>

	</body>
</html>