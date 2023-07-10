<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Return Book</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	<form action="ReturnBook">
		<h2>Return Book</h2>
		<label>Book ID</label>
		<br>
		<input placeholder="Enter Book ID" name="bID">
		<br><br>
		<label>Student ID</label>
		<br>
		<input placeholder="Enter Stud ID" name="sID">
		<br><br>
		<button>Submit</button>
	</form>
</body>
</html>