/**
 * 
 */
package com.crs.lt.dao;

import java.util.List;
import java.util.Set;

import com.crs.lt.bean.Course;

/**
 * @author user218
 *
 */
public interface CourseDaoInterface {
	public void addCourse(Course course);

	public Course getCourseById(int courseId);

	public void deleteCourse(int courseId);
	
	public Course updateCourse(Course course);
	
	public Set<Course> displayCourse();
}
