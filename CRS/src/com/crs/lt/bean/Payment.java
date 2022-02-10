package com.crs.lt.bean;

public class Payment {
private Student studentId;
private Notification refId;
private float amount;
private boolean status;
public Student getStudentId() {
	return studentId;
}
public void setStudentId(Student studentId) {
	this.studentId = studentId;
}
public Notification getRefId() {
	return refId;
}
public void setRefId(Notification refId) {
	this.refId = refId;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
}
