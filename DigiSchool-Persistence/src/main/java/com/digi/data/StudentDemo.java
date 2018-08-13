package com.digi.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Embeddable
@Table(name = "Student")
public class StudentDemo implements java.io.Serializable{
	
	private String username;
	private String createdBy;
	
	
	public StudentDemo() {
		super();
	}


	public StudentDemo(String username, String createdBy) {
		super();
		this.username = username;
		this.createdBy = createdBy;
	}
@Id
@Column(name = "USERNAME", nullable = false, length = 20)
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 20)
	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	

}
