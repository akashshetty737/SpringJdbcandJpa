package com.lti.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope(scopeName="prototype")
public class Student {

	private int rollNumber;
	private String studentName;
	private double studentScore;
	
	@Autowired
	private Address address;
	
	public Student() {
//		System.out.println("----Student-----");

	}
	public Student(int rollNumber, String studentName, double studentScore) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentScore = studentScore;
//		System.out.println("----Student(-,-,-)-----");
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	
	
}
