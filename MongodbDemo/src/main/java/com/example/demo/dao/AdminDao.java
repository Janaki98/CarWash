package com.example.demo.dao;

import com.example.demo.Exceptions.CarWashException;
import com.example.demo.entity.AdminDetails;

public interface AdminDao {

	public AdminDetails findUser(AdminDetails admin) throws CarWashException;
}
