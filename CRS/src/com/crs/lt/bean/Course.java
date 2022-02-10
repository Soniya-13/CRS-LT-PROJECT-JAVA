/**
 * 
 */
package com.crs.lt.bean;

/**
 * @author user218
 *
 */
public class Course {
private String courseId;
private String courseName;
private boolean isOffered;
private String instructor;
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public boolean isOffered() {
	return isOffered;
}
public void setOffered(boolean isOffered) {
	this.isOffered = isOffered;
}
public String getInstructor() {
	return instructor;
}
public void setInstructor(String instructor) {
	this.instructor = instructor;
}

}
