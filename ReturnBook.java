package org.jsp.Elibrary.utility;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.BookDao;
import org.jsp.Elibrary.dao.LibrarianDao;

@WebServlet("/ReturnBook")
public class ReturnBook extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bId = req.getParameter("bID");
		String temp = req.getParameter("sID");
		int sID = Integer.parseInt(temp);
		
		PrintWriter out = resp.getWriter();
		if(BookDao.returnBook(bId, sID) > 0)
		{
			resp.sendRedirect("ReturnBook.jsp");
			out.println("Book Return Successfully");
		}
		else
		{
			resp.sendRedirect("ReturnBook.jsp");
			out.println("Unable to return Book. Kindly vist Later");
		}
	}
}
