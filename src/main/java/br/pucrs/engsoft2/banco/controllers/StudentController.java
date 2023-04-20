package br.pucrs.engsoft2.banco.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.*;
import br.pucrs.engsoft2.banco.repositories.StudentRepository;

@RestController
public class StudentController {
	private final StudentRepository studentRepository;

	@Autowired
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@PostMapping("/student/register")
	public String registerStudent(@RequestBody Student student) {
		this.studentRepository.save(student);
		return "Student registered successfully";
	}

	@GetMapping("/student/all")
	public List<Student> getAllStudents() {
		return this.studentRepository.getAll();
	}

}
