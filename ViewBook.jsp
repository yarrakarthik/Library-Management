<%@page import="org.jsp.Elibrary.dao.BookDao"%>
<%@page import="org.jsp.Elibrary.dto.Book"%>
<%@page import="java.util.List"%>
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
		List<Book> list = BookDao.view();
	%>
	<table>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Publisher</th>
			<th>Quantity</th>
			<th>Issue Status</th>
			<th>Delete</th>
		</tr>
		<%
			for(Book book : list)
			{
		%>
		<tr>
			<td><%=book.getBookID() %></td>
			<td><%=book.getBookName() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getPublisher() %>
			<td><%=book.getQuantity() %></td>
			<td><%=book.getIssued() %></td>
			<td><a href="DeleteBook?bookId="<%book.getBookID();%>>Delete</a></td>
		</tr>
		<%
			}
		%>
</body>
</html>