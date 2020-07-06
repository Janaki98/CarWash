package com.example.demo.service;

import com.example.demo.Exceptions.CarWashException;
import com.example.demo.entity.AdminDetails;

public interface AdminService {
	AdminDetails login(AdminDetails admin) throws CarWashException;

}