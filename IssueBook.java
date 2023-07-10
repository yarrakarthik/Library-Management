package org.jsp.Elibrary.utility;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.BookDao;
import org.jsp.Elibrary.dto.IssueBookDto;

@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bID = req.getParameter("bID");
		String temp = req.getParameter("sID");
		int sID = Integer.parseInt(temp);
		String sName = req.getParameter("sName");
		String sPhn = req.getParameter("sPhn");
		
		IssueBookDto issue = new IssueBookDto(bID,sID,sName,sPhn);
		
		PrintWriter out = resp.getWriter();
		if(BookDao.issueBook(issue) > 0)
		{
			resp.sendRedirect("IssueBook.jsp");
			out.println("Book Issued Success Fully");
		}
		else
		{
			resp.sendRedirect("IssueBook.jsp");
			out.println("Sorry Unable to Issue Book. We may dont have storage of book. Kindly visit Later");
		}
	}
}
