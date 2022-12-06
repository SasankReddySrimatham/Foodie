package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AdminLogin {

	@Id

	@NotNull(message = "AdminId must not be null..")
	private String AdminId;
	
	@NotNull(message = "Password must not be null..")
	private String Password;
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		this.AdminId = adminId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	@Override
	public String toString() {
		return "AdminLogin [adminId=" + AdminId + ", password=" + Password + "]";
	}
	
}
