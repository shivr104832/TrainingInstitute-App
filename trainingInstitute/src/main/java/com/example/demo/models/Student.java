package com.example.demo.models;

 

import org.springframework.stereotype.Component;

import lombok.Data;

 
@Data
@Component
public class Student{

	String student_name;
	int percentage;
	String branch;
	String status;
	String phone;
	String email;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String student_name,int percentage, String branch, String status,String phone,String email) {
    	super();
		this.student_name = student_name;
		this.percentage = percentage;
		this.branch = branch;
		this.phone=phone;
		this.email=email;
		this.status = status;
    }
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getstudent_name() {
		return student_name;
	}
	public void setstudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	
	public int getpercentage() {
		return percentage;
	}
	public void setpercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getStatus() {
		return status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Students [student_name=" + student_name + ", percentage=" + percentage + ", branch=" + branch
				+ ",phone=" + phone + ", status=" + status + "]";
	} 
    
}