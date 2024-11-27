 package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.service.UserServices;
import com.cjc.main.exception.InvalidAgeException;
import com.cjc.main.exception.UserNotFoundException;
@RestController
public class UserController {
@Autowired
UserServices us;
@PostMapping("/createUser")
public ResponseEntity<User> onCreateUser(@RequestBody User u)
{   User userRef = us.saveUserData(u);
	return new ResponseEntity<User>(userRef,HttpStatus.CREATED);

}


@GetMapping("/SingleUserData/{id}")
public ResponseEntity<User> SingleUserData(@PathVariable int id)
{
	User userReg = us.getSingleUserData(id);
	return new ResponseEntity<User> (userReg,HttpStatus.OK);
}





}
