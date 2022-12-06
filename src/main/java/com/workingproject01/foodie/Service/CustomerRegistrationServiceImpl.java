package com.workingproject01.foodie.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.CustomerRegistration;
import com.workingproject01.foodie.Repo.CustomerRegistrationRepository;

@Service
@Transactional
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

	@Autowired
	CustomerRegistrationRepository customerRegistrationRepository;
	
	@Override
	public CustomerRegistration saveCustomerRegistration(CustomerRegistration customerRegistration) {
		// TODO Auto-generated method stub
		return customerRegistrationRepository.save(customerRegistration);
	}

	@Override
	public List<CustomerRegistration> viewCustomerRegistrationDetails() {
		// TODO Auto-generated method stub
		return customerRegistrationRepository.findAll();
	}

	@Override
	public CustomerRegistration deleteCustomerRegistrationById(int customerRegistrationId) {
		CustomerRegistration customerRegistration1=customerRegistrationRepository.findById(customerRegistrationId).orElseThrow();
		CustomerRegistration customerRegistration=customerRegistration1;
		customerRegistrationRepository.delete(customerRegistration);
		return customerRegistration1;
	}
	
}
