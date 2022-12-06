package com.workingproject01.foodie.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DeliveryExecutiveRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int DeliveryExecutiveId;
	
	@NotNull(message = "DeliveryExecutiveName must not be null..")
	private String DeliveryExecutiveName;
	
	@NotNull(message = "DeliveryExecutiveEmail must not be null..")
	
	private String DeliveryExecutiveEmail;
	
	@NotNull(message = "DeliveryExecutiveContactNo must not be null..")
	
	private long DeliveryExecutiveContactNo;
	
	@NotNull(message = "DeliveryExecutiveUserName must not be null..")
	private String DeliveryExecutiveUserName;
	
	@NotNull(message = "DeliveryExecutivePassword must not be null..")
	
	private String DeliveryExecutivePassword;
	
	
	public int getDeliveryExecutiveId() {
		return DeliveryExecutiveId;
	}
	public void setDeliveryExecutiveId(int deliveryExecutiveId) {
		DeliveryExecutiveId = deliveryExecutiveId;
	}
	public String getDeliveryExecutiveName() {
		return DeliveryExecutiveName;
	}
	public void setDeliveryExecutiveName(String deliveryExecutiveName) {
		DeliveryExecutiveName = deliveryExecutiveName;
	}
	public String getDeliveryExecutiveEmail() {
		return DeliveryExecutiveEmail;
	}
	public void setDeliveryExecutiveEmail(String deliveryExecutiveEmail) {
		DeliveryExecutiveEmail = deliveryExecutiveEmail;
	}
	public long getDeliveryExecutiveContactNo() {
		return DeliveryExecutiveContactNo;
	}
	public void setDeliveryExecutiveContactNo(long deliveryExecutiveContactNo) {
		DeliveryExecutiveContactNo = deliveryExecutiveContactNo;
	}
	public String getDeliveryExecutiveUserName() {
		return DeliveryExecutiveUserName;
	}
	public void setDeliveryExecutiveUserName(String deliveryExecutiveUserName) {
		DeliveryExecutiveUserName = deliveryExecutiveUserName;
	}
	public String getDeliveryExecutivePassword() {
		return DeliveryExecutivePassword;
	}
	public void setDeliveryExecutivePassword(String deliveryExecutivePassword) {
		DeliveryExecutivePassword = deliveryExecutivePassword;
	}
	@Override
	public String toString() {
		return "DeliveryExecutiveRegistration [DeliveryExecutiveId=" + DeliveryExecutiveId + ", DeliveryExecutiveName="
				+ DeliveryExecutiveName + ", DeliveryExecutiveEmail=" + DeliveryExecutiveEmail
				+ ", DeliveryExecutiveContactNo=" + DeliveryExecutiveContactNo + ", DeliveryExecutiveUserName="
				+ DeliveryExecutiveUserName + ", DeliveryExecutivePassword=" + DeliveryExecutivePassword + "]";
	}
	
	
}
