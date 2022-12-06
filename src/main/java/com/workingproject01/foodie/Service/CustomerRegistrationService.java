package com.workingproject01.foodie.Service;

import java.util.List;

import com.workingproject01.foodie.Model.CustomerRegistration;

public interface CustomerRegistrationService {

	CustomerRegistration saveCustomerRegistration(CustomerRegistration customerRegistration);

	List<CustomerRegistration> viewCustomerRegistrationDetails();

	CustomerRegistration deleteCustomerRegistrationById(int customerRegistrationId);


}
