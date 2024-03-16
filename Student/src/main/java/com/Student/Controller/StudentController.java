package com.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Entity.Student;
import com.Student.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/studentsave")
	public Student saveStudent(@RequestBody Student student)
	{
		     Student studentSaved=studentService.student_add(student);
		     return studentSaved;
	}
	@PostMapping("/student")
	public String saveStudent_string(@RequestBody Student student)
	{
	     String studentSaved=studentService.student_add_String(student);
		     return studentSaved;
	}
	
}
