package com.lti.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Student;

@Repository("dao")

public class StudentDaoJdbcImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	private static final String CREATE_STUDENT = "insert into student(roll_number,student_name,student_score) values(?,?,?)";
	private static final String READ_STUDENT = "select * from student where roll_number = ?";
	private static final String UPDATE_STUDENT = "update student set student_name=?, student_score=? where roll_number = ?";
	private static final String DELETE_STUDENT = "delete from student where roll_number = ?";
	private static final String READ_ALL_STUDENTS = "select * from student order by roll_number";
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createStudent(Student student) {
		int result = jdbcTemplate.update(CREATE_STUDENT, student.getRollNumber(),student.getStudentName(),student.getStudentScore());
		return result;
	}

	@Override
	public Student readStudentByRollNumber(int rollNumber) {
		 
		 // List<Student> students =jdbcTemplate.query(READ_STUDENT, new StudentRowMapper()); 
		   Student student = jdbcTemplate.queryForObject(READ_STUDENT, new Object[]{rollNumber}, new StudentRowMapper());
		   
		   return student;
	}

	@Override
	public int updateStudent(Student student) {
		int result = jdbcTemplate.update(UPDATE_STUDENT, student.getStudentName(), student.getStudentScore(), student.getRollNumber());
		return result;
	}

	@Override
	public int deleteStudent(int rollNumber) {
		int result = jdbcTemplate.update(DELETE_STUDENT, rollNumber);
		return result;
	}

	@Override
	public List<Student> readAllStudents() {
		List<Student> result = jdbcTemplate.query(READ_ALL_STUDENTS,new StudentRowMapper());
		return result;
	}

}
