<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Spring Tiles Contact Form</title>
<style type="text/css">
#registerForm {
	width: 300px;
	right: 500px;
	background-color: aqua;
}
#mheader{
	background-color: linear-gradient(to bottom, #b23435 0%,#891516 100%);
}
#registerForm_header{
	font-family:"Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
	font-size: 2em;
	color:black;
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
	font-weight: bold;
	clear: both;
    display: inline-block;
    overflow: hidden;
    white-space: nowrap;
}
#registerBtn{
	background-color:black;
	font-family:"Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
}
body {
	font-family:font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
}
</style>
</head>
<body>
	</br>
	</br>
	</br>
	</br>
	<div id="reg" class="container">
		<center>
			<h3 id="registerForm_header">
				REGISTER
				</h2>
		</center>
		<center>
			<form class="form-signin" id=rForm>
				<input type="text" class="form-control" name="firstname"
					placeholder="First Name" required="" autofocus="" id="firstName" />
				<input type="text" class="form-control" name="middlename"
					placeholder="Middle Name" required="" autofocus="" /> <input
					type="text" class="form-control" name="lastname"
					placeholder="Last Name" required="" autofocus="" /> <input
					type="text" class="form-control" name="dob" placeholder="DOB"
					required="" autofocus="" /> <input type="text"
					class="form-control" name="ssn"
					placeholder="Social Security Number" required="" autofocus="" />
					<input type="text" class="form-control" name="question" placeholder="Enter a Security Question" required="" autofocus="" />
					<input type="text" class="form-control" name="answer" placeholder="Enter Security Question's Answer" required="" autofocus="" />
				<button class="btn btn-lg btn-primary btn-block" id="registerBtn" type="submit">Register</button>
			</form>
		</center>
		<div class="modal fade" id="myModal" role="dialog">
			<div class="modal-dialog">

				<!-- Modal content-->
				<div class="modal-content">
					<div id="mheader" class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Registration Successful</h4>
					</div>
					<div id="modalBody" class="modal-body">
						<p id=testmodalpara>testValue: ${model.registerBean.firstname}</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
			<p></p>
		</div>

	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#rForm').submit(function(e) {
				e.preventDefault();
				console.log('in javascript');
				var formData = $('#rForm').serialize();
				console.log(formData);
				$.ajax({
					data : formData,
					type : 'GET',
					url : 'registerForm',
					success : function(result) {
						console.log(result);
						$("#testmodalpara").html("<p>" + result + "</p>")
						$('#myModal').modal('show');
					}
				});
			});
		});
	</script>
	</br>
	</br>
	</br>
	</br>
	</br></br>
	</br>
	</br>
	</br>
	</br></br>
	</br>
	</br>
	</br>
	</br></br>
	</br>
</body>
</html>

