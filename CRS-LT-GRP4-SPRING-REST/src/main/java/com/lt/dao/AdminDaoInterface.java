/**
 * 
 */
package com.lt.dao;

import java.util.List;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.exception.CourseFoundException;
import com.lt.exception.CourseNotDeletedException;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.ProfessorNotAddedException;
import com.lt.exception.StudentNotFoundForApprovalException;
import com.lt.exception.UserIdAlreadyInUseException;
import com.lt.exception.UserNotAddedException;
import com.lt.exception.UserNotFoundException;


/**
 * @author Group-4
 *
 */
public interface AdminDaoInterface {
	
	
	public void deleteCourse(String courseCode) throws CourseNotFoundException, CourseNotDeletedException;

	
	public void addCourse(Course course) throws CourseFoundException;
	
	public List<Student> viewPendingAdmissions();
	
	public void approveStudent(int studentId) throws StudentNotFoundForApprovalException;
	
	public void addProfessor(Professor professor) throws ProfessorNotAddedException, UserIdAlreadyInUseException;
	
	
	public void addUser(User user) throws UserNotAddedException, UserIdAlreadyInUseException;
	
	
	public void assignCourse(String courseCode, int professorId) throws CourseNotFoundException, UserNotFoundException;
	
	
	public List<Course> viewCourses(int catalogId);
	
	
	public List<Professor> viewProfessors();
}
