<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>eLibrary</title>
<link rel="stylesheet" href="ELibrary.css">
</head>
<body>
	<h1>eLibrary</h1>
	<div Id="main">
	<div class="sub1">
	<h2>Admin Login</h2>
	<form action="AdminLogin" method="post">
		<label>Email Address</label>
		<br>
		<input placeholder="Enter Email" name="email" type="email">
		<br><br>
		<label>PassWord</label>
		<br>
		<input placeholder="Enter Password" name="pass" type="password" >
		<br><br>
		<button style="background: ; color: white">Login</button>
	</form>
	<%
		String msg = (String)request.getAttribute("msg");
		if(msg != null)
		{
			
	%>
		<strong style="color: red"><%=msg %></strong>
	<%
		}
	%>
	</div>
	<div class="sub2">
	
	
	<h2>Librarian Login</h2>
	<form action="LibrarianLogin" method="post">
		<label>Email Address</label>
		<br>
		<input placeholder="Enter Email" name="email" type="email">
		<br><br>
		<label>PassWord</label>
		<br>
		<input placeholder="Enter Password" name="pass" type="password">
		<br><br>
		<button>Login</button>
	</form>
		<%String message = (String)request.getAttribute("msg2");
			if(message != null)
			{
		%>
			<strong style="color: red"><%=msg %></strong>
		<%
			}
		%>
	</div>
	</div>
</body>
</html>