package com.workingproject01.foodie.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity

public class PaymentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int PaymentId;
	
	@NotNull(message = "CardNo must not be null..")
	private int CardNo;
	

	@NotNull(message = "CardName must not be null..")
	private String CardName;
	

	@NotNull(message = "Date must not be null..")
	private LocalDate Date;
	

	@NotNull(message = "CVV must not be null..")
	private int CVV;
	

	@NotNull(message = "TotalPrice must not be null..")
	private int TotalPrice;
	
	@OneToOne
	@JoinColumn(name="CartId",referencedColumnName="CartId")
	private Cart CartId;

	public int getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

	public Cart getCartId() {
		return CartId;
	}

	public void setCartId(Cart cartId) {
		CartId = cartId;
	}

	@Override
	public String toString() {
		return "PaymentDetails [PaymentId=" + PaymentId + ", CardNo=" + CardNo + ", CardName=" + CardName + ", Date="
				+ Date + ", CVV=" + CVV + ", TotalPrice=" + TotalPrice + ", CartId=" + CartId + "]";
	}
	
	
}
