<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.btn-group-lg>.btn, .btn-lg {
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
}
#modal-submit{
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
	background-color:black;
}

.modal-title {
	font-size: 2em;
	color:black;
	font-family: "Avant Garde", Avantgarde, "Century Gothic", CenturyGothic, AppleGothic, sans-serif;
}
.modal-header{
	background:linear-gradient(to bottom, #b23435 0%,#891516 100%);
}
#startElection{
	background-color:black;
	border-color:black;
}
#addParty{
	background-color:black;
	border-color:black;
}
#StopElection{
	background-color:black;
	border-color:black;
}
#showResults{
	background-color:black;
	border-color:black;
}
#lockResults{
	background-color:black;
	border-color:black;
}


</style>

<script type="text/javascript">
	$(document).ready(function($) {
		$("#addParty").click(function() {
			$("#actionModalHeading").text("Add Party/Candidates");
			$("#modalForm").attr("action","addParty");
			$("#modalForm").attr("method","POST");
			$("#modalForm").append('<center><input type="text" class="form-control" name="Party" id="Party" placeholder=" Enter Party Name"/></center></br>');
			$("#modalForm").append('<center><input type="text" class="form-control" name="CandidateName" id="CandidateName" placeholder=" Enter candidate Name"/></center></br>');
			$("#modalForm").append('</br><input type="submit" id="modal-submit" class="btn btn-lg btn-primary btn-block" type="submit" align="right""/>');
			$('#myModal').modal('show');
		});
	
		$("#startElection").click(function() {
			$("#modalForm").attr("action","startElection");
			$("#modalForm").attr("method","POST");
			$("#actionModalHeading").text("Are you sure you want to start the election process ?");
			$("#modalForm").append('</br><input type="submit" id="modal-submit" class="btn btn-lg btn-primary btn-block" type="submit" align="right""/>');
			$('#myModal').modal('show');
			
		});
	
		$("#StopElection").click(function() {
			$("#modalForm").attr("action","stopElection");
			$("#modalForm").attr("method","POST");
			$("#actionModalHeading").text("Are you sure you want to stop the election process ?");
			$("#modalForm").append('</br><input type="submit" id="modal-submit" class="btn btn-lg btn-primary btn-block" type="submit" align="right""/>');
			$('#myModal').modal('show');
		});
	
		$("#showResults").click(function() {
			$("#modalForm").attr("action","showResults");
			$("#modalForm").attr("method","POST");
			$("#actionModalHeading").text("Are you sure you want to show the results ?");
			$("#modalForm").append('</br><input type="submit" id="modal-submit" class="btn btn-lg btn-primary btn-block" type="submit" align="right""/>');
			$('#myModal').modal('show');
			
		});
	
		$("#lockResults").click(function() {
			$("#modalForm").attr("action","lockResults");
			$("#modalForm").attr("method","POST");
			$("#actionModalHeading").text("Are you sure you want to lock results ?");
			$("#modalForm").append('</br><input type="submit" id="modal-submit" class="btn btn-lg btn-primary btn-block" type="submit" align="right""/>');
			$('#myModal').modal('show');
			
		});
	});

	  $(document).ready(function($) {
		$("#myModal").on("hidden.bs.modal", function(){
			$(this).data('bs.modal', null);
		});
	});  
</script>

</head>
<body>
</br></br></br></br></br></br></br></br></br></br></br>
	<center>
		<div class="container">
			<div class="btn-group-vertical" role="group" aria-label="First group">
				<button id = "addParty" type="button" class="btn btn-primary btn-lg">Add Party/Candidates </button>
				</br>
				<button type="button" id="startElection" class="btn btn-primary btn-lg">Start
					Election Process</button>
				</br>
				<button type="button" id="StopElection" class="btn btn-primary btn-lg">Stop
					Election Process</button>
				</br>
				<button type="button" id="showResults" class="btn btn-primary btn-lg">Show
					Election Results</button>
				</br>
				<button type="button" id="lockResults" class="btn btn-primary btn-lg">Lock Results</button>
				</br>
			</div>
		</div>
	</center>

	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id = "actionModalHeading"></h4>
				</div>
				<div id="modalBody" class="modal-body">
					<form id="modalForm" class="form-signin"></form>
				</div>
				<div class="modal-footer">
				</div>
			</div>
		</div>
		<p></p>
	</div>
</body>
</br></br></br></br></br></br></br></br></br></br></br></br>
</html>