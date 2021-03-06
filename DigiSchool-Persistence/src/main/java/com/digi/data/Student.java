package com.digi.data;

import java.util.Date;

@SuppressWarnings("serial")
public class Student implements java.io.Serializable {
	
	private String studentId;
	private School school;
	private Parent parent;
	private String name;
	private String MobNo;
	private String mailId;
	private String xml;
	private String classSection;
	private String status;
	private String lstOfSubj;
	private Date createdOn;
	private Date modifiedOn;
	private String modifiedBy;
	private String imageId;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return MobNo;
	}
	public void setMobNo(String mobNo) {
		MobNo = mobNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getLstOfSubj() {
		return lstOfSubj;
	}
	public void setLstOfSubj(String lstOfSubj) {
		this.lstOfSubj = lstOfSubj;
	}
	
	
}
