<!DOCTYPE html>
<html>
<head>

<!-- /.website title -->
<title>Backyard login</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<!-- CSS Files -->
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="fonts/icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet" media="screen">
<link href="css/owl.theme.css" rel="stylesheet">
<link href="css/owl.carousel.css" rel="stylesheet">

<!-- Colors -->
<link href="css/css-index.css" rel="stylesheet" media="screen">
<!-- <link href="css/css-index-green.css" rel="stylesheet" media="screen"> -->
<!-- <link href="css/css-index-purple.css" rel="stylesheet" media="screen"> -->
<!-- <link href="css/css-index-red.css" rel="stylesheet" media="screen"> -->
<!-- <link href="css/css-index-orange.css" rel="stylesheet" media="screen"> -->
<!-- <link href="css/css-index-yellow.css" rel="stylesheet" media="screen"> -->

<!-- Google Fonts -->
<link rel="stylesheet" href="fyy3" />

</head>
  
<body data-spy="scroll" data-target="#navbar-scroll">

<!-- /.preloader -->
<div id="preloader"></div>
<div id="top"></div>

<!-- /.parallax full screen background image -->
<div class="fullscreen landing parallax" style="background-image:url('images/bg.jpg');" data-img-width="2000" data-img-height="1333" data-diff="100">
	
	<div class="overlay">
		<div class="container">
			<div class="row">
				<div class="col-md-7">
				
					<!-- /.logo -->
					<div class="logo wow fadeInDown"> <a href=""><img src="images/logo.png" alt="logo"></a></div>

					<!-- /.main title -->
					<div>&nbsp;</div>
				    <div>&nbsp;</div>
				    <div>&nbsp;</div>
				 		<h1 class="wow fadeInLeft">
						Backyard Bookstore
						</h1>

					<!-- /.header paragraph -->
							  


				</div> 
				
				<!-- /.signup form -->
				<div class="col-md-5">
				
					<div class="signup-header wow fadeInUp">
						<h2 class="form-title text-center">Login</h2>
						<h4 class="form-title text-center">${requestScope.message }</h4>
				        <h4 class="form-title text-center">${requestScope.success }</h4>
						<form class="form-header" action="customerLogin" role="form" method="POST" id="login_form" name="form1">
						<input type="hidden" name="u" value="503bdae81fde8612ff4944435">
						<input type="hidden" name="id" value="bfdba52708">
							<div class="form-group">
								<input class="form-control input-lg" name="name" id="name" type="text" placeholder="Your username" required>
							</div>
							<div class="form-group">
								<input class="form-control input-lg" name="password" id="p" type="password" placeholder="Your password" required>
							</div>
							<div class="form-group last">
								<input type="submit" class="btn btn-warning btn-block btn-lg" value="µÇÂ¼">
							</div>
							<div>
							 <div > <a href="${pageContext.request.contextPath}/registerForm" style="font-size:15px" >register</a></div>
							 <div > <a href="${pageContext.request.contextPath}/findPassword " style="font-size:15px">findPassword</a></div>
                             <div > <a href="${pageContext.request.contextPath}/userLoginForm" style="font-size:15px">manager login</a></div>
         <div>
	</div>
						</form>
					</div>				
				
				</div>
			</div>
		</div> 
	</div> 
</div>
 
	
	<!-- /.javascript files -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="js/jquery.sticky.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script>
		new WOW().init();
	</script>
  </body>
</html>