package com.hibernet.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentId;
	
	
	@Column(name="student_name", length=100, unique=true)
	private String name;
	private String college;
	private String phone;
	private String fatherName;
	private boolean active = true;	
}
