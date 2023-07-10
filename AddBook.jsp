<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	<form action="AddBook" method="post">
		<h1>Add Book</h1>
		<label>BookID</label>
		<br>
		<input placeholder="Enter Book ID" name="id">
		<br><br>
		<label>Book Name</label>
		<br>
		<input placeholder="Enter Book Name" name="name">
		<br><br>
		<label>Author</label>
		<br>
		<input placeholder="Enter Author Name" name="author">
		<br><br>
		<label>Publisher</label>
		<br>
		<input placeholder="Enter Publisher Name" name="publisher">
		<br><br>
		<label>Quantity</label>
		<br>
		<input placeholder="Quantity" name="quantity">
		<br><br>
		<button>Submit</button>
	</form>
</body>
</html>