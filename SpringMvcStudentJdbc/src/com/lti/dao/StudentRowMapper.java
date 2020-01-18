package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lti.model.Student;


public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			int rollNumber = rs.getInt("roll_number");
			String studentName = rs.getString("student_name");
			double score = rs.getDouble("student_score");
			Student student = new Student(); //change later
			
			student.setRollNumber(rollNumber);
			student.setStudentName(studentName);
			student.setStudentScore(score);
			
			return student;
	}

}
