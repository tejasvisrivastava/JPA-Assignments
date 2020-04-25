package com.capg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	@Id
	private int authorId;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String firstName;
	private String middleName;
	private String lastName;
	private long phoneNo;
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Author(int authorId, String firstName, String middleName, String lastName, long phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	

}
