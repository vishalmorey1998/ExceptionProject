package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.main.service.AdminService;

@RestController
public class AdminController 
{
@Autowired 
AdminService adminservice;
     @DeleteMapping("/delete_User/{id}")
	public ResponseEntity<String> onDeleteUser(@PathVariable int id)
	{
	adminservice.deleteUser(id);
	return new ResponseEntity<String>("Delete User Id Successfully",HttpStatus.OK);
	
	}
}
