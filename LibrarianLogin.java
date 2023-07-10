package org.jsp.Elibrary.utility;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.LibrarianDao;
import org.jsp.Elibrary.dto.Librarian;

@WebServlet("/LibrarianLogin")
public class LibrarianLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		boolean status = LibrarianDao.verfy(email, pass);
		
		if(status)
		{
			resp.sendRedirect("LibrarianSection.jsp");
		}
		else
		{
			req.setAttribute("msg2", "Inavlid email or password");
			RequestDispatcher dispatcher = req.getRequestDispatcher("AdminLibrarian.jsp");
			dispatcher.include(req, resp);
		}
	}
}
