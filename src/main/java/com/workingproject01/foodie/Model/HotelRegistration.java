package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity

public class HotelRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int HotelId;
	
	@NotNull(message = "HotelName must not be null..")
	private String HotelName;
	

	@NotNull(message = "HotelEmail must not be null..")
	private String HotelEmail;
	

	@NotNull(message = "HotelContactNo must not be null..")
	private long HotelContactNo;
	

	@NotNull(message = "HotelUserName must not be null..")
	private String HotelUserName;
	
	@NotNull(message = "HotelPassword must not be null..")
	private String HotelPassword;
	

	@NotNull(message = "HotelAdress must not be null..")
	private String HotelAddress;
	
	
	public int getHotelId() {
		return HotelId;
	}
	public void setHotelId(int hotelId) {
		HotelId = hotelId;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String getHotelEmail() {
		return HotelEmail;
	}
	public void setHotelEmail(String hotelEmail) {
		HotelEmail = hotelEmail;
	}
	public long getHotelContactNo() {
		return HotelContactNo;
	}
	public void setHotelContactNo(long hotelContactNo) {
		HotelContactNo = hotelContactNo;
	}
	
	public String getHotelUserName() {
		return HotelUserName;
	}
	public void setHotelUserName(String hotelUserName) {
		HotelUserName = hotelUserName;
	}
	public String getHotelPassword() {
		return HotelPassword;
	}
	public void setHotelPassword(String hotelPassword) {
		HotelPassword = hotelPassword;
	}
	public String getHotelAddress() {
		return HotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		HotelAddress = hotelAddress;
	}
	@Override
	public String toString() {
		return "HotelRegistration [HotelId=" + HotelId + ", HotelName=" + HotelName + ", HotelEmail=" + HotelEmail
				+ ", HotelContactNo=" + HotelContactNo + ", HotelUserName=" + HotelUserName + ", HotelPassword="
				+ HotelPassword + ", HotelAddress=" + HotelAddress + "]";
	}
	
	
	
}
