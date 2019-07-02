package com.auxo.springboot.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empid;
	
	private String empname;
	
	
	private int age;
	
		
	private Date date;
	
	
	private String place;
	
	
	private Long phone; 
	
	
	private int dprtid;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmp_name(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public int getDprtid() {
		return dprtid;
	}

	public void setDprtid(int dprtid) {
		this.dprtid = dprtid;
	}
	

}
