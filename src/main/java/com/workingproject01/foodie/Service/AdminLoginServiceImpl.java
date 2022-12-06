package com.workingproject01.foodie.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workingproject01.foodie.Model.AdminLogin;
import com.workingproject01.foodie.Repo.AdminLoginRepository;

@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired AdminLoginRepository adminLoginRepository;

	@Override
	public AdminLogin postAdminLogin(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
		return adminLoginRepository.save(adminLogin);
	}

	
	
	
}
