<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Librarian</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	
	<form action="AddLibrarian" method="post">
	<h2>Add Librarian</h2>
		<label>ID</label>
		<br>
		<input placeholder="Enter Id" name="id">
		<br><br>
		<label>Name</label>
		<br>
		<input placeholder="Enter Name" name="name">
		<br><br>
		<label>Email</label>
		<br>
		<input type="email" placeholder="Enter Email" name="email">
		<br><br>
		<label>Mobile Number</label>
		<br>
		<input type="number" placeholder="Enter mobile number" name="mobile">
		<br><br>
		<label>Choose Password</label>
		<br>
		<input type="password" placeholder="Enter Password" name="pass">
		<br><br>
		<button>Submit</button>
	</form>	
</body>
</html>