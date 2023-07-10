package org.jsp.Elibrary.utility;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.Elibrary.dao.LibrarianDao;
import org.jsp.Elibrary.dto.Librarian;
@WebServlet("/EditLibrarian")
public class EditLibrarian extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		int iD = Integer.parseInt(id);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String pass = req.getParameter("pass");
		
		Librarian lib = new Librarian(name,email,mobile,pass,iD);
		LibrarianDao.update(lib);
		resp.sendRedirect("ViewLibrarian.jsp");
	}
}
