<%@ page language="java" contentType="text/html; charset=windows-1256"	pageEncoding="windows-1256"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>


<style type="text/css">
.form-style-5 {
	max-width: 1000px;
	padding: 10px 20px;
	background: #f4f7f8;
	margin: 10px auto;
	padding: 20px;
	background: #f4f7f8;
	border-radius: 8px;
	font-family: Georgia, "Times New Roman", Times, serif;
}

.form-style-5 fieldset {
	border: none;
}

.form-style-5 legend {
	font-size: 1.4em;
	margin-bottom: 10px;
	margin-top: 20px;
}

.form-style-5 label {
	margin-bottom: 0px;
}

.form-style-5 input[type="text"], .form-style-5 input[type="date"],
	.form-style-5 input[type="datetime"], .form-style-5 input[type="email"],
	.form-style-5 input[type="number"], .form-style-5 input[type="search"],
	.form-style-5 input[type="time"], .form-style-5 input[type="url"],
	.form-style-5 textarea, .form-style-5 select {
	font-family: Georgia, "Times New Roman", Times, serif;
	background: rgba(255, 255, 255, .1);
	border: none;
	border-radius: 4px;
	font-size: 16px;
	margin: 0;
	outline: 0;
	padding: 7px;
	width: 45%;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	background-color: #e8eeef;
	color: #8a97a0;
	-webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
	box-shadow: 0 1px 0 rgba(0, 0, 0, 0.03) inset;
	margin-bottom: 30px;
}

.form-style-5 input[type="text"]:focus, .form-style-5 input[type="date"]:focus,
	.form-style-5 input[type="datetime"]:focus, .form-style-5 input[type="email"]:focus,
	.form-style-5 input[type="number"]:focus, .form-style-5 input[type="search"]:focus,
	.form-style-5 input[type="time"]:focus, .form-style-5 input[type="url"]:focus,
	.form-style-5 textarea:focus, .form-style-5 select:focus {
	background: #d2d9dd;
}

.form-style-5 select {
	-webkit-appearance: menulist-button;
	height: 35px;
}

.form-style-5 .number {
	background: #1abc9c;
	color: #fff;
	height: 30px;
	width: 30px;
	display: inline-block;
	font-size: 0.8em;
	margin-right: 4px;
	line-height: 30px;
	text-align: center;
	text-shadow: 0 1px 0 rgba(255, 255, 255, 0.2);
	border-radius: 15px 15px 15px 0px;
}

.form-style-5 .h4 {
	margin-top: 0;
}

.form-style-5 input[type="submit"], .form-style-5 input[type="button"] {
	position: relative;
	display: block;
	padding: 19px 39px 18px 39px;
	color: #FFF;
	margin: 0 auto;
	background: #1abc9c;
	font-size: 18px;
	text-align: center;
	font-style: normal;
	width: 100%;
	border: 1px solid #16a085;
	border-width: 1px 1px 3px;
	margin-bottom: 20px;
}

.form-style-5 input[type="submit"]:hover, .form-style-5 input[type="button"]:hover
	{
	background: #109177;
}

h4 {
	font-size: 1.0em;
	margin-bottom: 4px;
	margin-top: 4px;
	font-family: Georgia, "Times New Roman", Times, serif;
	color: #6a7780;
}

h1 {
	font-size: 2.0em;
	margin-bottom: 4px;
	margin-top: 4px;
	font-family: Georgia, "Times New Roman", Times, serif;
	color: #6a7780;
}

table {
	width: 100% padding: 10px 20px;
	background: rgba(255, 255, 255, .1);
	margin: 10px auto;
	padding: 20px;
	border-radius: 8px;
	font-family: Georgia, "Times New Roman", Times, serif;
	border-collapse: collapse;
}

td, th {
	border: 1px solid #dddddd;
	font-family: Georgia, "Times New Roman", Times, serif;
	text-align: left;
	padding: 8px;
	color: #6a7780;
}

tr:nth-child(even) {
	font-family: Georgia, "Times New Roman", Times, serif;
	background-color: #dddddd;
}
</style>



<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script type="text/javascript">
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();
		$("#datepicker2").datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();
		$("#datepicker3").datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();
		$("#datepicker4").datepicker({
			dateFormat : 'yy-mm-dd'
		}).val();

	});

	function updateMinGuestRate(val) {
		if (val < 0) {
			document.getElementById('uploadedMinGuestRate').innerHTML = "Min Rate(No Filter)";
		} else {
			document.getElementById('uploadedMinGuestRate').innerHTML = "Min Rate="
					+ val;
		}
	}

	function updateMaxGuestRate(val) {
		if (val < 0) {
			document.getElementById('uploadedMaxGuestRate').innerHTML = "Max Rate(No Filter)";
		} else {
			document.getElementById('uploadedMaxGuestRate').innerHTML = "Max Rate="
					+ val;
		}
	}

	function updateMinHotelRate(val) {
		if (val < 0) {
			document.getElementById('uploadedMinHotelRate').innerHTML = "Min Rate(No Filter)";
		} else {
			document.getElementById('uploadedMinHotelRate').innerHTML = "Min Rate="
					+ val;
		}
	}

	function updateMaxHotelRate(val) {
		if (val < 0) {
			document.getElementById('uploadedMaxHotelRate').innerHTML = "Max Rate(No Filter)";
		} else {
			document.getElementById('uploadedMaxHotelRate').innerHTML = "Max Rate="
					+ val;
		}
	}

	function updateMaxTotalRate(val) {
		if (val < 0) {
			document.getElementById('uploadedMaxHotelRate').innerHTML = "Max Rate(No Filter)";
		} else {
			document.getElementById('uploadedMaxHotelRate').innerHTML = "Max Rate="
					+ val;
		}
	}
</script>
</head>
<!-- **************************************************************************************************************** -->


<body>


	<div class="form-style-5">
		<h1 align="center">Expedia Hotels Finder</h1>
		<form method="GET" action="HotelsReservations.do">
			<fieldset>
				<legend>
					<span class="number">1</span> Hotel
				</legend>
				<input type="text" name="destinationCountry" placeholder="Country">
				<input type="text" name="destinationCity" placeholder="City">
				<input type="number" name="regionID" placeholder="Region ID"
					pattern="[0-9]" min="0"> <input type="text"
					name="hotelName" placeholder="Hotel Name">

				<h4>Star Rate</h4>
				<!-- assum that if the value is 0 or .5 there is no validation -->
				<input type="range" name="minStarRate" min="-1" max="5" step=".5"
					value="-1" onchange="updateMinHotelRate(this.value);"> <label
					id="uploadedMinHotelRate">Min Rate(No Filter)</label> <input
					type="range" name="maxStarRate" min="-1" max="5" step=".5"
					value="-1" onchange="updateMaxHotelRate(this.value);"> <label
					id="uploadedMaxHotelRate">Max Rate(No Filter)</label>


				<h4>Guest Rate</h4>
				<!-- assum that if the value is 0 or .5 there is no validation -->
				<input type="range" name="minGuestRate" min="-1" max="5" step=".5"
					value="-1" onchange="updateMinGuestRate(this.value);"> <label
					id="uploadedMinGuestRate">Min Rate(No Filter)</label> <input
					type="range" name="maxGuestRate" min="-1" max="5" step=".5"
					value="-1" onchange="updateMaxGuestRate(this.value);"> <label
					id="uploadedMaxGuestRate">Max Rate(No Filter)</label>


				<h4>Total Rate</h4>
				<!-- assum that if the value is 0 or .5 there is no validation -->
				<input type="number" name="minTotalRate" value="" pattern="[0-9]"
					min="0" placeholder="Min Total Rate"> <input type="number"
					name="maxTotalRate" value="" pattern="[0-9]" min="0"
					placeholder="Max Total Rate">


				<legend>
					<span class="number">2</span> Trip Date
				</legend>

				<h4>Check in</h4>

				<input type="date" name="minStartDate" placeholder="Min(YYYY-MM-DD)"
					onfocusout="(this.type='text')"
					pattern="[0-9]{4}-[0-1]{1}[0-9]{1}-[0-3]{1}[0-9]{1}"
					title="Enter a date in this formart YYYY-MM-DD" id="datepicker">
				<input type="date" name="maxStartDate" placeholder="Max(YYYY-MM-DD)"
					onfocusout="(this.type='text')"
					pattern="[0-9]{4}-[0-1]{1}[0-9]{1}-[0-3]{1}[0-9]{1}"
					title="Enter a date in this formart YYYY-MM-DD" id="datepicker2">
				<h4>Check out</h4>
				<input type="date" name="minEndDate" value=""
					placeholder="Min(YYYY-MM-DD)" onfocusout="(this.type='text')"
					pattern="[0-9]{4}-[0-1]{1}[0-9]{1}-[0-3]{1}[0-9]{1}"
					title="Enter a date in this formart YYYY-MM-DD" id="datepicker3">
				<input type="date" name="maxEndDate" value=""
					placeholder="Max(YYYY-MM-DD)" onfocusout="(this.type='text')"
					pattern="[0-9]{4}-[0-1]{1}[0-9]{1}-[0-3]{1}[0-9]{1}"
					title="Enter a date in this formart YYYY-MM-DD" id="datepicker4">
				<h4>Length of Stay</h4>
				<input type="number" name="lengthOfStay" value="" pattern="[0-9]"
					min="0"> <input type="submit" value="Search" />



				<table>

					<tr>
						<th>Country</th>
						<th>City</th>
						<th>Region ID</th>
						<th>Hotel Name</th>
						<th>Check in</th>
						<th>Check out</th>
						<th>Star Rate</th>
						<th>Guest Rate</th>
						<th>Total Rate</th>
						<th></th>
					</tr>

					<%
						Map<Integer, List> map = (Map) request.getAttribute("hotelsOffers");
						if (map != null) {
							for (Map.Entry<Integer, List> entry : map.entrySet()) {
					%>
					<tr>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(0));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(1));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(2));
							%>
						</td>

						<td>
							<%
								out.print("<br> " + entry.getValue().get(3));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(4));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(5));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(6));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(7));
							%>
						</td>
						<td>
							<%
								out.print("<br> " + entry.getValue().get(8));
							%>
						</td>
						<td><img src="<%out.print(entry.getValue().get(9));%>">

						</td>
					</tr>
					<%} }%>
				</table>
		</form>
	</div>




</body>
</html>