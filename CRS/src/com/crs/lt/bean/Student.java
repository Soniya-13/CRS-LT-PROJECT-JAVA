/**
 * 
 */
package com.crs.lt.bean;

/**
 * @author user218
 *
 */
public class Student{
	private String branchName;
	private int studentId;
	private int batch;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
}
