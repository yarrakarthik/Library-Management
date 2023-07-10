<%@page import="java.util.List"%>
<%@page import="org.jsp.Elibrary.dao.LibrarianDao"%>
<%@page import="org.jsp.Elibrary.dto.Librarian"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Librarian> list = LibrarianDao.view();
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Password</th>
		</tr>
		<% 
			for(Librarian lib : list)
			{
		%>
		<tr>
			<td><%=lib.getId() %></td>
			<td><%=lib.getName() %></td>
			<td><%=lib.getEmail() %></td>
			<td><%=lib.getMobile() %></td>
			<td><%=lib.getPassword() %></td>
			<td><a href="EditLibrarian.jsp">Edit</a></td>
			<td><a href="DeleteLibrarian?id="<%=lib.getId() %>>Delete</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>