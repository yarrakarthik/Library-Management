package org.jsp.Elibrary.dto;

import java.sql.Date;

public class IssueBookDto 
{
	private String bookID,studName,mobile;
	private int studID;
	private Date issuedDate;
	private String returnStatus;
	
	public IssueBookDto() {}
	
	public IssueBookDto(String bookID,int studID, String studName, String mobile) {
		this.bookID = bookID;
		this.studID = studID;
		this.studName = studName;
		this.mobile = mobile;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	
	
}
