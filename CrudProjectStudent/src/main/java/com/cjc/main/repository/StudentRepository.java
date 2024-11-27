package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>
{

	


}
