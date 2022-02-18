
package com.crs.lt.bean;


import com.crs.lt.constant.Role;

/**
 * 
 * @author Group-4
 *
 */
public abstract class User {
	private String userId;
	private String name;
	private Role role;
	private String password;

	

	
	public User(String userId, String name, Role role, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.role = role;
		this.password = password;

	}
	
	
	public User(){
		
	}
	
	
	public String getUserId() {
		return userId;
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Role getRole() {
		return role;
	}
	
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
