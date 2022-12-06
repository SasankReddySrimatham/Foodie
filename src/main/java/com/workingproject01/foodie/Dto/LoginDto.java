package com.workingproject01.foodie.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginDto {

	private String UserName;
	
	@JsonIgnore
	private boolean IsLoggedIn;
	private String Role;
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public boolean isIsLoggedIn() {
		return IsLoggedIn;
	}
	public void setIsLoggedIn(boolean isLoggedIn) {
		IsLoggedIn = isLoggedIn;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Override
	public String toString() {
		return "LoginDto [UserName=" + UserName + ", IsLoggedIn=" + IsLoggedIn + ", Role=" + Role + "]";
	}
	
	
}
