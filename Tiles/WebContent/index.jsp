<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<style type="text/css">
div {
	width: 300px;
	height: 100px;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	left:900px;
	top: -300px;
	word-spacing: 30px;
	letter-spacing: 10px;
	display: inline;
}
#reglink {
	text-align: center;
	font-weight: bold;
	color: teal;
}
h2 {
	text-align: center;
	font-weight: bold;
}

h4 {
	text-align: center;
	font-weight: 600;
}
</style>
</head>
<body>
	<div class="login">
		<form class="form-signin" method="post" action="loginPage" >
			<h2>V E B</h2>
			<input type="text" class="form-control" name="validationNumber"
				placeholder="validationNumber" required="" autofocus="" /> <input
				type="password" class="form-control" name="password"
				placeholder="Password" required="" /> <label class="checkbox">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
		</form>
		<a href="register.html" action="register" role="button"  id="reglink">Register</a>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>