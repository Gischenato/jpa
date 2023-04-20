package br.pucrs.engsoft2.banco.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;

@RestController
public class StudentRetrieveController {
	@GetMapping("/student/allstudent")
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		return students;
	}

}
