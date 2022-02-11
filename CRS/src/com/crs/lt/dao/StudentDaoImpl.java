/**
 * 
 */
package com.crs.lt.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.crs.lt.bean.Student;

/**
 * @author user218
 *
 */
public class StudentDaoImpl implements StudentDaoInterface{
	//List<Student> studentList = new ArrayList<Student>();
	Set<Student> studentSet = new HashSet<Student>();
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		student.setStudentId((int) Math.random());
		studentSet.add(student);		
	}

	public Student getStudentById(int studentId) {
		Iterator itr = studentSet.iterator();
		while (itr.hasNext()) {
			Student student = (Student) itr.next();
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		Iterator itr = studentSet.iterator();
		while (itr.hasNext()) {
			Student student = (Student) itr.next();
			if (student.getStudentId() == studentId) {
				studentSet.remove(student);
			}
		}
	}

	public Student updateStudent(Student student) {
		Iterator itr = studentSet.iterator();
		while (itr.hasNext()) {
			Student student1 = (Student) itr.next();
			if (student1.getStudentId() == student.getStudentId()) {
				student1.setBatch(student.getBatch());
				student1.setBranchName(student.getBranchName());
				student1.setName(student.getName());
				return student1;
			}
		}
		return null;
	}

	public Set<Student> listStudent() {

		return studentSet;
	}

}
