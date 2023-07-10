package org.jsp.Elibrary.utility;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.LibrarianDao;

@WebServlet("/DeleteLibrarian")
public class DeleteLibrarian extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String temp = req.getParameter("id");
		int id = Integer.parseInt(temp);
		LibrarianDao.delete(id);
		resp.sendRedirect("ViewLibrarian.jsp");
	}
}
