package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Student;
import com.lti.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String homePage(){
		
		return "index";
	}
	@RequestMapping(path ="addStudent.view", method= RequestMethod.GET)
	public String addStudentView(){
		return "addStudent";
		
	}
	
	@RequestMapping(path = "addStudent.do", method= RequestMethod.POST)
	public String addStudent(Student student){
		
		// No need for explicitly taking information here it will be done by spring framework
		//String rollNumber = request.getParameter("rollNumber");
		boolean result = service.addStudent(student);
		if(result){
			return "redirect:findAllStudents.do";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(path = "findAllStudents.do", method = RequestMethod.GET)
		public String findAllStudents(Model model){
			List<Student> students = service.viewAllStudents();
			model.addAttribute("students", students);
			return "viewAllStudents";
			
		}
		
	@RequestMapping(path ="modifyStudent.view", method= RequestMethod.GET)
	public String modifyStudentView(){
		return "modifyStudent";
		
	}
	
	@RequestMapping(path = "modifyStudent.do", method= RequestMethod.POST)
	public String modifyStudent(Student student){
		// No need for explicitly taking information here it will be done by spring framework
		//String rollNumber = request.getParameter("rollNumber");
		boolean result = service.modifyStudent(student);
		if(result){
			return "redirect:findAllStudents.do";
		}else{
			return "error";
		}
	}
	
	
	@RequestMapping(path ="deleteStudent.view", method= RequestMethod.GET)
	public String deleteStudentView(){
		return "deleteStudent";
		
	}
	
	@RequestMapping(path = "deleteStudent.do", method= RequestMethod.POST)
	public String deleteStudent(Student student){
		// No need for explicitly taking information here it will be done by spring framework
		//String rollNumber = request.getParameter("rollNumber");
		boolean result = service.removeStudent(student.getRollNumber());
		if(result){
			return "redirect:findAllStudents.do";
		}else{
			return "error";
		}
	}
	
}
