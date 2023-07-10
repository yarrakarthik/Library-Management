<%@page import="org.jsp.Elibrary.dto.IssueBookDto"%>
<%@page import="java.util.List"%>
<%@page import="org.jsp.Elibrary.dao.BookDao"%>
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
		List<IssueBookDto> list = BookDao.viewIssueBook();
	%>
	<table>
		<tr>
			<th>Book ID</th>
			<th>Stud ID</th>
			<th>Stud Name</th>
			<th>Mobile</th>
			<th>Issued Date</th>
			<th>Return Status</th>
		</tr>
	<%
		for(IssueBookDto issue : list)
		{
	%>
		<tr>
			<td><%=issue.getBookID() %></td>
			<td><%=issue.getStudID() %></td>
			<td><%=issue.getStudName() %></td>
			<td><%=issue.getMobile() %></td>
			<td><%=issue.getIssuedDate() %></td>
			<td><%=issue.getReturnStatus() %></td>
		</tr>
	<%
		}
	%>
</body>
</html>