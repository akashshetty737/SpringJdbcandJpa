package com.lti.service;

import java.util.List;

import com.lti.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findStudentByRollNumber(int rollNumber);
	public boolean modifyStudent(Student student);
	public boolean removeStudent(int rollNumber);
	public List<Student> viewAllStudents();
	
}
