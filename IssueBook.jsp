<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Issue Book</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	<form action="IssueBook" method="post">
		<h2>Issue Book</h2>
		
		<label>Book Id</label>
		<br>
		<input placeholder="Enter Book ID" name="bID">
		<br><br>
		<label>Std ID</label>
		<br>
		<input placeholder="Enter Student ID" name="sID">
		<br><br>
		<label>Std Name</label>
		<br>
		<input placeholder="EnterStudent Name" name="sName">
		<br><br>
		<label>Student Mobile</label>
		<br>
		<input placeholder="Enter Mobile Nuumber" type="number" name="sphn">
		<br><br>
		<button>Issue Book</button>
	</form>
</body>
</html>