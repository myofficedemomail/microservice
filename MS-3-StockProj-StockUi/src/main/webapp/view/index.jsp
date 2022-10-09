<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
	display: flex;
	justify-content: center;
}

.stock_container {
	height: 250px;
	width: 320px;
	border: 6px solid blue;
	border-radius: 5px;
	margin-top: 50px;
}

.heading {
	text-align: center;
	/* border-bottom: 2px solid blue; */
}

.content {
	display: flex;
	justify-content: center;
	margin-top: 10px;
}

#buybtn:hover {
	border: 2px solid black;
	background-color: aquamarine;
}
</style>
</head>

<body>
	<form action="buy">
		<div class="container">
			<div class="stock_container">
				<div class="heading">
					<h2>Buy Stock</h2>
					<div style="display: flex; justify-content: center;">
						<div
							style="height: 2px; border-bottom: 1px solid blue; width: 150px;"></div>
					</div>
				</div>
				<div class="content">
					<div style="width: 40%; text-align: right;">
						<label for="">Company Name::</label>
					</div>
					<div>
						<input type="text" name="companyname">
					</div>
				</div>
				<div style="margin-top: 10px;" class="content">
					<div style="width: 40%; text-align: right;">
						<label for="">Quantity::</label>
					</div>
					<div>
						<input type="text" name="qty">
					</div>
				</div>
				<div style="margin-top: 15px;" class="content">
					<input id="buybtn" type="submit" value="Buy"
						style="padding: 5px; color: blue; border-radius: 5px; font-weight: bold;">
				</div>
				<div
					style="display: flex; justify-content: center; margin-top: 10px;">
					<div class="totalprice" style="text-align: center;">${msg}</div>
				</div>
			</div>
		</div>
	</form>
</body>

</html>