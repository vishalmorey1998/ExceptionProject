package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface StudentService {

public	Iterable<Student> saveStudentData(Student s);

public Iterable<Student> getAllData(Student s);

public Student postData(Student st);

public void deleteStudentData(int sid);

public void PutStudentData(Student ss);

}
