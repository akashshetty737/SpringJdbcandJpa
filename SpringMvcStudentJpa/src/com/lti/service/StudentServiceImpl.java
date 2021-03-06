package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.dao.StudentDao;
import com.lti.model.Student;

@Service("service")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;



	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addStudent(Student student) {
		int result = dao.createStudent(student);

		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public Student findStudentByRollNumber(int rollNumber) {

		return dao.readStudentByRollNumber(rollNumber);
	}

	@Override
	public boolean modifyStudent(Student student) {
		int result = dao.updateStudent(student);

		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public boolean removeStudent(int rollNumber) {
		int result = dao.deleteStudent(rollNumber);

		if(result==1)
			return true;
		else
			return false;
	}

	@Override
	public List<Student> viewAllStudents() {
		
		return dao.readAllStudents();
	}

}
