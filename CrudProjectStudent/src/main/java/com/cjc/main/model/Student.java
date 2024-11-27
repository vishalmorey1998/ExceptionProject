package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private int studId;
	private String studName;
	private String studAddress;
	private long studMobno;
	private int studAge;
	

}
