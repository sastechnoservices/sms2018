package com.digi.data;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SchoolClass implements Serializable{
	
	private String classId;
	private School school;
	private String trend;
	private String lstOfCmpSubj;
	private String lstOfOptSubj;
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
	}
	public String getLstOfCmpSubj() {
		return lstOfCmpSubj;
	}
	public void setLstOfCmpSubj(String lstOfCmpSubj) {
		this.lstOfCmpSubj = lstOfCmpSubj;
	}
	public String getLstOfOptSubj() {
		return lstOfOptSubj;
	}
	public void setLstOfOptSubj(String lstOfOptSubj) {
		this.lstOfOptSubj = lstOfOptSubj;
	}
	
}
