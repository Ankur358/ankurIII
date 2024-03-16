package com.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Entity.Student;
import com.Student.Repository.StudentRepository;
@Service
public class StudentServiceImple  implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student student_add(Student stu) {
		 Student studentSave=studentRepository.save(stu);
		return studentSave;
	}

	@Override
	public String student_add_String(Student stu) {
		Student studentsave=studentRepository.save(stu);
		
		return "Student Saved....";
	}

	
	
	

}
