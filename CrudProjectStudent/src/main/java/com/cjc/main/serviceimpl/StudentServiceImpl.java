package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.cjc.main.model.Student;
import com.cjc.main.repository.StudentRepository;
import com.cjc.main.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService
{@Autowired
	StudentRepository sr;
	@Override
	public Iterable<Student> saveStudentData(Student s) {
		return sr.findAll();
	
	
		
	}
	@Override
	public Iterable<Student> getAllData(Student s) {
		return sr.findAll();
		
	}
	@Override
	public Student postData(Student st) {
		// TODO Auto-generated method stub
		return sr.save(st);
	}
	@Override
	public void deleteStudentData(int sid) {
		sr.deleteById(sid);
		
	}
	@Override
	public void PutStudentData(Student ss) {
sr.save(ss);
		
	}
	
	
}
