package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Hotel {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int HPayoutId;
	
	@OneToOne
	@JoinColumn(name="HotelId" ,referencedColumnName="HotelId")
	private HotelRegistration HotelId;
	

	@NotNull(message = "HPayout must not be null..")
	private String HPayout;
	
	
	public int getHPayoutId() {
		return HPayoutId;
	}
	public void setHPayoutId(int hPayoutId) {
		HPayoutId = hPayoutId;
	}
	public HotelRegistration getHotelId() {
		return HotelId;
	}
	public void setHotelId(HotelRegistration hotelId) {
		HotelId = hotelId;
	}
	public String getHPayout() {
		return HPayout;
	}
	public void setHPayout(String hPayout) {
		HPayout = hPayout;
	}
	@Override
	public String toString() {
		return "Hotel [HPayoutId=" + HPayoutId + ", HotelId=" + HotelId + ", HPayout=" + HPayout + "]";
	}
	
	
}
