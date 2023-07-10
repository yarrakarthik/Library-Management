package org.jsp.Elibrary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsp.Elibrary.dto.Book;
import org.jsp.Elibrary.dto.IssueBookDto;

public class BookDao 
{
	public static int save(Book book)
	{
		int status = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("insert into elibrarry.bookstore values(?,?,?,?,?,?)");
		
		ps.setString(1, book.getBookID());
		ps.setString(2, book.getBookName());
		ps.setString(3, book.getAuthor());
		ps.setString(4, book.getPublisher());
		ps.setInt(5, book.getQuantity());
		ps.setInt(6, 0);
		
		status = ps.executeUpdate();
		
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	public static List<Book> view()
	{
		List<Book> list = new ArrayList<Book>();
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.bookstore");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			Book book = new Book();
			book.setBookID(rs.getString("BookID"));
			book.setBookName(rs.getString("BookName"));
			book.setAuthor(rs.getString("Author"));
			book.setPublisher(rs.getString("Publisher"));
			book.setQuantity(rs.getInt("Quantity"));
			book.setIssued(rs.getInt("Issued"));
			
			list.add(book);
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static int delete(String bookID)
	{
		int status = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("delete from elibrarry.bookstore where BookID = ?");
		ps.setString(1, bookID);
		status = ps.executeUpdate();
		
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int getIssue(String bookID)
	{
		int issue = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select *from elibrarry.bookstore where bookID = ?");
		ps.setString(1, bookID);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			issue = rs.getInt("Issued");
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return issue;
	}
	public static boolean checkIssue(String bookID)
	{
		boolean status = false;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.bookstore where bookID = ? and Quantity > Issued");
		ps.setString(1, bookID);
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
	public static int issueBook(IssueBookDto issue)
	{
		String bookID = issue.getBookID();
		System.out.println("check Status : "+checkIssue(bookID));
		if(checkIssue(bookID))
		{
			int status = 0;
			try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("insert into elibrarry.issubook values(?,?,?,?,?,?)");
			ps.setString(1, issue.getBookID());
			ps.setInt(2, issue.getStudID());
			ps.setString(3, issue.getStudName());
			ps.setString(4, issue.getMobile());
			ps.setString(6, issue.getReturnStatus());
			ps.setDate(5, issue.getIssuedDate());
			status = ps.executeUpdate();
			if(status > 0)
			{
				PreparedStatement ps2 = con.prepareStatement("update elibrarry.bookstore set Issued = ? where BookID = ?");
				ps2.setInt(1, getIssue(bookID)+1);
				ps2.setString(2, bookID);
				status = ps2.executeUpdate();
			}
			con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}
		else {
			return 0;
		}
	}
	public static int returnBook(String bookID, int studID)
	{
		int status = 0;
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("update elibrarry.issubook set ReturnStatus = 'yes' where bookID = ? and StudID = ?");
		ps.setString(1, bookID);
		ps.setInt(2, studID);
		status = ps.executeUpdate();
		if(status > 0)
		{
			PreparedStatement ps2 = con.prepareStatement("update elibrarry.bookstore Issued = ? where bookID = ?");
			ps2.setInt(1, getIssue(bookID)-1);
			ps2.setString(2, bookID);
			status = ps2.executeUpdate();
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	public static List<IssueBookDto> viewIssueBook()
	{
		List<IssueBookDto> list = new ArrayList<IssueBookDto>();
		try {
		Connection con = DB.getCon();
		PreparedStatement ps = con.prepareStatement("select * from elibrarry.issubook order by IssuedDate desc");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			IssueBookDto issue = new IssueBookDto();
			issue.setBookID(rs.getString("BookID"));
			issue.setStudID(rs.getInt("StudID"));
			issue.setStudName(rs.getString("StudName"));
			issue.setMobile(rs.getString("Mobile"));
			issue.setIssuedDate(rs.getDate("IssuedDate"));
			issue.setReturnStatus(rs.getString("ReturnStatus"));
			
			list.add(issue);
		}
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
