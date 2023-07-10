package org.jsp.Elibrary.dto;

public class Book 
{
	private String bookID,bookName,author,publisher;
	private int quantity,issued;
	
	public Book() {}
	
	public Book(String bookID, String bookName, String author, String publisher, int quantity) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getIssued() {
		return issued;
	}
	public void setIssued(int issued) {
		this.issued = issued;
	}
	
	
}
