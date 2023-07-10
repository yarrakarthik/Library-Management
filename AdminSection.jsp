<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Section</title>

	<style>
		.a,a{
			text-decoration: none;
			left: 10px;
			position: relative;
			color: white;
			line-height: 20px;
			line-height: 40px;
			font-size: 20px
		}
		#main{
			width: 100%;
			display:flex;
			align-items:center;
			justify-content:space-between;
			background: black;
			height: 80px;
		}
		a{
			left: -100px;
			position: relative;
		}
		.a1{
			color:black;
			left:70px;
			position: relative;
		}
	</style>
</head>
<body>
	<div>
	<div id="main">
		<a class="a" href="AddLibrarian.jsp"><span>Add Librarian</span></a>
		<a href="ViewLibrarian.jsp"><span>View Librarian</span></a>
		<a href="EditLibrarian.jsp"><span>Edit Librarian</span></a>
		<a href="ViewLibrarian.jsp"><span>Delete Librarian</span></a>
		<a href="AdminLibrarian.jsp" style="background: blue; border-radius: 5px;"><span style="padding: 20px;">Log Out</span></a>
	</div>
	</div>
	<h1>Admin Section</h1>
	<a href="AddLibrarian.jsp" class="a1">Add Librarian</a>
	<br>
	<a class="a1" href="ViewLibrarian.jsp">View Librarian</a>
	<br>
	<a class="a1" href="EditLibrarian.jsp">Edit Librarian</a>
	<br>
	<a class="a1" href="ViewLibrarian.jsp">Delete Librarian</a>
	<br>
	<a class="a1" style="background: blue; border-radius: 5px; padding: 10px; color: white;" href="AdminLibrarian.jsp">Log Out</a>
</body>
</html>