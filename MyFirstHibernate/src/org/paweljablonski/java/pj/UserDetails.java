package org.paweljablonski.java.pj;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table (name="USER")
public class UserDetails {
	@Id
	@Column (name="id")
	private int userId;
	@Column (name="name")
	private String userName;
	@Column (name="age")
	private int userAge;
	@Temporal (TemporalType.DATE)
	private Date dateOfBought;
	@Lob
	private String description;
	
	public Date getDateOfBought() {
		return dateOfBought;
	}
	public void setDateOfBought(Date dateOfBought) {
		this.dateOfBought = dateOfBought;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
}
