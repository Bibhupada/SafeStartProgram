package com.sapient.kafkaproducer.kafkaproducer.model;

public class Department {
	
	public Department(int deptId,String deptName,String deptLocation) {
		this.deptId=deptId;
		this.deptName=deptName;
		this.deptLocation=deptLocation;
	}
	
	public Department() {
		
	}
	
	int deptId;
	String deptName;
	String deptLocation;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}

}
