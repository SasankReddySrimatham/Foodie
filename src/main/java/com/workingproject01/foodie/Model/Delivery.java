package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int DPayoutId;
	
	@OneToOne
	@JoinColumn(name="DeliveryExecutiveId",referencedColumnName="DeliveryExecutiveId")
	private DeliveryExecutiveRegistration DeliveryExecutiveId;
	
	@NotNull(message = "DPayout must not be null..")
	private String DPayout;
	
	
	public int getDPayoutId() {
		return DPayoutId;
	}
	public void setDPayoutId(int dPayoutId) {
		DPayoutId = dPayoutId;
	}
	public DeliveryExecutiveRegistration getDeliveryExecutiveId() {
		return DeliveryExecutiveId;
	}
	public void setDeliveryExecutiveId(DeliveryExecutiveRegistration deliveryExecutiveId) {
		DeliveryExecutiveId = deliveryExecutiveId;
	}
	public String getDPayout() {
		return DPayout;
	}
	public void setDPayout(String dPayout) {
		DPayout = dPayout;
	}
	@Override
	public String toString() {
		return "Delivery [DPayoutId=" + DPayoutId + ", DeliveryExecutiveId=" + DeliveryExecutiveId + ", DPayout="
				+ DPayout + "]";
	}
	
	
}
