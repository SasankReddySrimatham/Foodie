package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CustomerRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CustomerId;
	
	@NotNull(message = "CustomerName must not be null..")
	private String CustomerName;
	
	@NotNull(message = "CustomerEmail must not be null..")
	
	private String CustomerEmail;
	
	@NotNull(message = "CustomerUserName must not be null..")
	private String CustomerUsername;
	
	@NotNull(message = "CustomerPassword must not be null..")
	
	private String CustomerPassword;
	
	@NotNull(message = "CustomerContactNo must not be null..")
	private long CustomerContactNo;
	
	@NotNull(message = "CustomerAddress must not be null..")
	private String CustomerAddress;

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getCustomerUsername() {
		return CustomerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		CustomerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return CustomerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		CustomerPassword = customerPassword;
	}

	public long getCustomerContactNo() {
		return CustomerContactNo;
	}

	public void setCustomerContactNo(long customerContactNo) {
		CustomerContactNo = customerContactNo;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "CustomerRegistration [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerEmail="
				+ CustomerEmail + ", CustomerUsername=" + CustomerUsername + ", CustomerPassword=" + CustomerPassword
				+ ", CustomerContactNo=" + CustomerContactNo + ", CustomerAddress=" + CustomerAddress + "]";
	}
	
	
}