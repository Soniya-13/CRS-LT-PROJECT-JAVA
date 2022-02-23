package com.lt.business;

import com.lt.dao.UserDaoInterface;
import com.lt.dao.UserDaoOperation;
import com.lt.exception.UserNotFoundException;

/**
 * 
 * @author Group-4
 *
 */
public class UserOperation implements UserInterface {
	
	private static UserOperation instance=null;
	UserDaoInterface userDaoInterface= UserDaoOperation.getInstance();
	private UserOperation()
	{
		
	}
	
	
	public static UserOperation getInstance()
	{
		if(instance==null)
		{
			
			synchronized(UserOperation.class){
				instance=new UserOperation();
			}
		}
		return instance;
	}

	
	@Override
	public boolean updatePassword(String userID,String newPassword) {
		return userDaoInterface.updatePassword(userID, newPassword);
	}

	
	
	@Override
	public boolean verifyCredentials(int userID, String password) throws UserNotFoundException {
		//DAO class
		try
		{
			return userDaoInterface.verifyCredentials(userID, password);		
		}
		finally
		{
			
		}
	}
	
	
	@Override
	public String getRole(int userId) {
		return userDaoInterface.getRole(userId);
	}


	

}
