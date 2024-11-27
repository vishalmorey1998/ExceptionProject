package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.exception.InvalidAgeException;
import com.cjc.main.exception.UserNotFoundException;
import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;
import com.cjc.main.service.UserServices;

@Service
public class UserServiceImpl implements UserServices
{
@Autowired private UserRepository usr;
	@Override
	public User saveUserData(User u) {
		if(u.getAge()>=18 && u.getAge()<=60)
		{
		User ur = usr.save(u);
		return ur;
		}
		else {
			throw new 
			InvalidAgeException("User age must be in range of 18 to 60 yeras");
		}
		
	}
	@Override
	public User getSingleUserData(int id) {
		
	Optional<User> userSingleData = usr.findById(id);
		if(userSingleData.isPresent()) {
			return userSingleData.get();
		}
		else {
			throw new UserNotFoundException("User is not Available on UserId "+ id);
		}
		


	}
	
	}






