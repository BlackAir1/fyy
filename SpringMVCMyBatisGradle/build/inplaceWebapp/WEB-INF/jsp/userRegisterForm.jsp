<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
<!-- All the files that are required -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link href="css/fyy.css" rel="stylesheet" type="text/css"> 
<link href="css/fyy1.css" rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="iconfont/iconfont.css">

		<title>manager register</title>
	</head>
<body>
 <!-- REGISTRATION FORM -->
 <div class="text-center" style="padding:50px 0">
	<div class="logo">register</div>
	<!-- Main Form -->
	<div class="login-form-1">
		<form id="register-form" class="text-left">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="reg_username" class="sr-only">Loginname</label>
						<input type="text" class="form-control" id="reg_username" name="loginname" placeholder="loginname">
					</div>
					<div class="form-group">
						<label for="reg_password" class="sr-only">Password</label>
						<input type="password" class="form-control" id="reg_password" name="password" placeholder="password">
					</div>
					<div class="form-group">
						<label for="reg_password_confirm" class="sr-only">name</label>
						<input type="password" class="form-control" id="reg_password_confirm" name="username" placeholder="name">
					</div>
					
					<div class="form-group">
						<label for="reg_email" class="sr-only">Phone</label>
						<input type="text" class="form-control" id="reg_email" name="phone" placeholder="phone no">
					</div>
					<div class="form-group">
						<label for="reg_fullname" class="sr-only">Address</label>
						<input type="text" class="form-control" id="reg_fullname" name="address" placeholder="address">
					</div>
					
				</div>
				<button type="submit" class="login-button"><i class="iconfont icon-more"></i></button>
			</div>
			<div class="etc-login-form">
				<p>already have an account? <a href="#">login here</a></p>
			</div>
		</form>
	</div>
	<!-- end:Main Form -->
  </div>
  <script src="js/jquery.validate.min.js"></script>
  <script src="js/1.js"></script>
</body>
</html>