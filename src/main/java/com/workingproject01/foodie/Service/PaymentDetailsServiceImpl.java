package com.workingproject01.foodie.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.PaymentDetails;
import com.workingproject01.foodie.Repo.PaymentDetailsRepository;

@Service 
@Transactional
public class PaymentDetailsServiceImpl implements  PaymentDetailsService{

	@Autowired PaymentDetailsRepository paymentDetailsRepository;
	
	@Override
	public PaymentDetails addNewPaymentDetails(PaymentDetails paymentDetails) {
		// TODO Auto-generated method stub
		return paymentDetailsRepository.save(paymentDetails);
	}

	@Override
	public PaymentDetails findAllPaymentDetails(int paymentId) {
		// TODO Auto-generated method stub
		return paymentDetailsRepository.findById(paymentId).orElseThrow();
	}

	@Override
	public List<PaymentDetails> AdminViewAllPayment() {
		// TODO Auto-generated method stub
		return paymentDetailsRepository.findAll();
	}

}
