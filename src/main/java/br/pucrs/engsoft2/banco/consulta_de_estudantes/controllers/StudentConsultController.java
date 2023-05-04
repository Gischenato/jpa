package br.pucrs.engsoft2.banco.consulta_de_estudantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
import br.pucrs.engsoft2.banco.consulta_de_estudantes.repositories.StudentConsultRepository;

@RestController
public class StudentConsultController {
    private final StudentConsultRepository studentConsultRepository;

	@Autowired
	public StudentConsultController(StudentConsultRepository studentRepository) {
		this.studentConsultRepository = studentRepository;
	}

	@GetMapping("/student/all")
	public List<Student> getAllStudents() {
		return this.studentConsultRepository.findAll();
	}

}
