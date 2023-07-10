package org.jsp.Elibrary.utility;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.BookDao;
import org.jsp.Elibrary.dto.Book;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		String temp = req.getParameter("quantity");
		int quantity = Integer.parseInt(temp);
		
		Book book = new Book(id,name,author,publisher,quantity);
		
		int i = BookDao.save(book);
		PrintWriter out = resp.getWriter();
		if(i > 0)
		{
			resp.sendRedirect("AddBook.jsp");
			out.println("Book Added Successfully");
		}
	}
}
