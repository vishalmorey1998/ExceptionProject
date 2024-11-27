package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.exception.UserNotFoundException;
import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;
import com.cjc.main.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{
  @Autowired UserRepository ur;
  
	@Override
	public void deleteUser(int id) {
		
		Optional<User> adminReg = ur.findById(id);
		if(adminReg.isPresent())
		{
			ur.deleteById(id);
		}
		else {
			throw new UserNotFoundException("User is not present on given id "+id);
		}
	}

}
