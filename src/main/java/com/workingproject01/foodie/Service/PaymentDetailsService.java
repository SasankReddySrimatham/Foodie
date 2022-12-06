package com.workingproject01.foodie.Service;

import java.util.List;

import com.workingproject01.foodie.Model.PaymentDetails;

public interface PaymentDetailsService {


	PaymentDetails addNewPaymentDetails(PaymentDetails paymentDetails);

	PaymentDetails findAllPaymentDetails(int paymentId);

	List<PaymentDetails> AdminViewAllPayment();

	


}
