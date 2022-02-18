package com.crs.lt.business;

import com.crs.lt.exception.StudentNotRegisteredException;

/**
 * 
 * @author Group-4
 *
 */
public interface StudentInterface {
	
	
	public int register(String name,String userID,String password,int batch,String branch) throws StudentNotRegisteredException; 
	
	public int getStudentId(String userId);
	
	
    public boolean isApproved(int studentId);
}
