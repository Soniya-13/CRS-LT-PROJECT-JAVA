/**
 * 
 */
package com.crs.lt.bean;

/**
 * @author user218
 *
 */
public class Student extends User{
	private String branchName;
	private int studentId;
	private int batch;
	private GradeCard gradeCard;

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
	public GradeCard getGradeCard() {
		return gradeCard;
	}
	public void setGradeCard(GradeCard gradeCard) {
		this.gradeCard = gradeCard;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batch;
		result = prime * result
				+ ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + studentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (batch != other.batch)
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}
}
