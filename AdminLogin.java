package org.jsp.Elibrary.utility;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jsp.Elibrary.dao.DB;

import java.sql.*;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		String query = "select * from elibrarry.admin where email=? and password=?";
		
		
		try {
			
			Connection connection = DB.getCon();
			System.out.println(connection);
			PreparedStatement ptmt = connection.prepareStatement(query);
			
			ptmt.setString(1, email);
			ptmt.setString(2, pass);
			
			ResultSet rs = ptmt.executeQuery();
			
			HttpSession session = req.getSession();
			
			RequestDispatcher dispatcher;
			
			if(rs.next())
			{
				 dispatcher = req.getRequestDispatcher("AdminSection.jsp");
			}
			else
			{
				req.setAttribute("msg","Inavlid Email or password" );
				 dispatcher = req.getRequestDispatcher("AdminLibrarian.jsp");
			}
			dispatcher.include(req, resp);
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
