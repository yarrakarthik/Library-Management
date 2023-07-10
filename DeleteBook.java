package org.jsp.Elibrary.utility;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.BookDao;

@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookId = req.getParameter("bookId");
		System.out.println(bookId);
		int status = BookDao.delete(bookId);
		
		if(status > 0)
		{
		resp.sendRedirect("ViewBook.jsp");
		}
	}
}
