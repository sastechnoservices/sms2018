package com.digi.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="username", nullable = false)
	private String name;
	
	@Column(name="created_by")
	private String name1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	

}
