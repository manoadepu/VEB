<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<style type="text/css">
.login {
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
	
	display: inline;
}
.leftDiv {
	width: 300px;
	height: 100px;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	left:-300px;
	top: 300px;
}
#login{
	background-color:black;
	border-color:black;
}
#reglink {
	text-align: center;
	font-weight: bold;
	color: teal;
}
a{
	color: black;
}

h2 {
	font-size: 3em;
	color:black;
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
	font-weight: bold;
	clear: both;
    display: inline-block;
    overflow: hidden;
    white-space: nowrap;
}
#reglink{
	color:black;
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
	font-size: 1.5em;
}
h4 {
	text-align: center;
	font-weight: 600;
}

body {
    	background:linear-gradient(to bottom, #b23435 0%,#891516 100%);
}

</style>
</head>
<body>
<div class="leftDiv"></div>
<img src="WebContent/WEB-INF/jsp/primary_logotype1.png" alt="Mountain View" style="width:304px;height:228px;">
	<div class="login">
		<form class="form-signin" method="post" action="loginPage" >
			<h2>Virtual Election Booth</h2>
			<input type="text" class="form-control" name="validationNumber"
				placeholder="validationNumber" required="" autofocus="" /><br> <input
				type="password" class="form-control" name="password"
				placeholder="Password" required="" /> <label class="checkbox">
			<button class="btn btn-lg btn-primary btn-block" id="login" type="submit">Login</button>
			<a href="register.html" action="register" role="button"  id="reglink">Register</a>
		</form>
		
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></br></br>
	<div>
        <div class="text-center center-block">
                <a href="https://www.facebook.com/bootsnipp"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com/bootsnipp"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://plus.google.com/+Bootsnipp-page"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
	            <a href="mailto:bootsnipp@gmail.com"><i id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
		</div>
	<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>