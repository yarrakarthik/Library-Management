package org.jsp.Elibrary.dto;

public class Librarian 
{
	private String name,email,mobile,password;
	private int id;
	
	public Librarian() {}
	
	public Librarian(String name, String email, String mobile, String password, int id) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.id = id;
	}
	
	
	public Librarian(String name, String email, String mobile, String password) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
