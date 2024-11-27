package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.main.model.Student;
import com.cjc.main.service.StudentService;

@Controller
@ResponseBody
public class StudentController {
	@Autowired
	StudentService ssi;
	
	@GetMapping("/getStudentData")
	public ResponseEntity<String> saveData(Student s)
	{
		Iterable<Student> li=ssi.saveStudentData(s);
		return new ResponseEntity<String>("DATA fetch",HttpStatus.OK);
		
		
	}
	@GetMapping("/getAllData")
	public ResponseEntity<Iterable<Student>> getAllData(Student s)
	{
		Iterable<Student> li = ssi.getAllData(s);
		return new ResponseEntity<Iterable<Student>>(li,HttpStatus.OK);
	}
	
	@PostMapping("/postStudentData")
	public ResponseEntity<Student> postData(@RequestBody Student st)
	{
		
		Student data = ssi.postData(st);
		return new ResponseEntity<Student>(data,HttpStatus.CREATED);
		
		
	}
	@DeleteMapping("/deleteData/{studId}")
	public ResponseEntity<String> deletedata(@PathVariable ("studId")int sid)
	{
		
		ssi.deleteStudentData(sid);
		return new ResponseEntity<String>("Delete Data Successfull",HttpStatus.OK);
	}
	@PutMapping("/updateData/{studId}")
public ResponseEntity<String> updateStudentData(@PathVariable("studId") int sId,@RequestBody Student ss)
{
	ssi.PutStudentData(ss);
	return new ResponseEntity<String>("Update Data Successfully",HttpStatus.OK);
	

}
}
