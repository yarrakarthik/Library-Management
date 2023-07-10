<%@page import="org.jsp.Elibrary.dto.Librarian"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Librarian</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	<%
		Librarian lib = new Librarian();
	%>
	<form action="EditLibrarian" method="post">
	<h2 style="top:25px; position:relative; ">Edit Librarian</h2>
		<input type="" <%=lib.getId() %>  placeholder="Enter Id" name="id">
		<br><br>
		<label>Name</label>
		<br>
		<input placeholder="Enter Name" <%=lib.getName() %>name="name">
		<br><br>
		<label>Email</label>
		<br>
		<input type="email" <%=lib.getEmail() %> placeholder="Enter Email" name="email">
		<br><br>
		<label>Mobile Number</label>
		<br>
		<input type="number" <%=lib.getMobile() %> placeholder="Enter mobile number" name="mobile">
		<br><br>
		<label>Choose Password</label>
		<br>
		<input type="password" <%=lib.getPassword() %> placeholder="Enter Password" name="pass">
		<br><br>
		<button>Update</button>
	</form>	
</body>
</html>