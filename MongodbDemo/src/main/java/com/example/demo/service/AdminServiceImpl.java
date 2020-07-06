package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.CarWashException;
import com.example.demo.dao.AdminDao;
import com.example.demo.entity.AdminDetails;

@Service
public class AdminServiceImpl implements AdminService{

@Autowired
	
	private AdminDao adminDao;
	@Override
	public AdminDetails login(AdminDetails admin) throws CarWashException {
		AdminDetails result = adminDao.findUser(admin);
		if (result==null) {
			throw new CarWashException("error");
		}
		return result;

	}

}
