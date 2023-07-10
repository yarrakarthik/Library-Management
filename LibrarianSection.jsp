<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Librarian Section</title>
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
		<a class="a" href="AddBook.jsp"><span>Add Book</span></a>
		<a href="ViewBook.jsp"><span>View Book</span></a>
		<a href="IssueBook.jsp"><span>Issue Book</span></a>
		<a href="ViewIssueBook.jsp"><span>View Issued Book</span></a>
		<a href="ReturnBook.jsp"><span>Return Book</span></a>
		<a href="AdminLibrarian.jsp" style="background: blue; border-radius: 5px;"><span style="padding: 20px;">Log Out</span></a>
	</div>
	</div>
	<h1>Librarian</h1>
	<a class="a1" href="AddBook.jsp">Add Book</a>
	<br>
	<a class="a1" href="ViewBook.jsp">View Book</a>
	<br>
	<a class="a1" href="IssueBook.jsp">Issue Book</a>
	<br>
	<a  class="a1" href="ViewIssueBook.jsp">View Issued Book</a>
	<br>
	<a class="a1" href="ReturnBook.jsp">Return Book</a>
	<br>
	<a class="a1" style="background: blue; border-radius: 5px; padding: 10px; color: white; href="AdminLibrarian.jsp">Log Out</a>
</body>
</html>