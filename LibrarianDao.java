package org.jsp.Elibrary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsp.Elibrary.dto.Librarian;

public class LibrarianDao 
{
	public static int save(Librarian lib)
	{
		int status = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("insert into elibrarry.librarian values(?,?,?,?,?)");
		ps.setInt(1,lib.getId());
		ps.setString(2, lib.getName());
		ps.setString(3, lib.getEmail());
		ps.setString(4, lib.getMobile());
		ps.setString(5, lib.getPassword());
		status = ps.executeUpdate();
		
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	public static int update(Librarian lib)
	{
		int status = 0;
		Connection con = DB.getCon();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("update elibrarry.librarian set name = ?, email = ?, mobile = ?, password = ? where id = ? ");
			ps.setString(1, lib.getName());
			ps.setString(2, lib.getEmail());
			ps.setString(3, lib.getMobile());
			ps.setString(4, lib.getPassword());
			ps.setInt(5, lib.getId());
			status = ps.executeUpdate();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return status;
	}
	public static List<Librarian> view()
	{
		List<Librarian> list = new ArrayList<Librarian>();
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.librarian");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Librarian lib = new Librarian();
			lib.setId(rs.getInt("id"));
			lib.setName(rs.getString("name"));
			lib.setEmail(rs.getString("email"));
			lib.setMobile(rs.getString("mobile"));
			lib.setPassword(rs.getString("password"));
			
			list.add(lib);
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static Librarian viewById(int id)
	{
		Librarian lib = new Librarian();
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.librarian where id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			lib.setId(rs.getInt("id"));
			lib.setName(rs.getString("name"));
			lib.setEmail(rs.getString("email"));
			lib.setMobile(rs.getString("mobile"));
			lib.setPassword(rs.getString("password"));
			
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lib;
	}
	public static int delete(int id)
	{
		int status = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("delete from elibrarry.librarian where id = ?");
		ps.setInt(1, id);
		status = ps.executeUpdate();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static boolean verfy(String email, String password)
	{
		boolean status = false;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.librarian where email = ? and password = ?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			status = true;
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
