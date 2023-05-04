package br.pucrs.engsoft2.banco.registro_de_estudantes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
import br.pucrs.engsoft2.banco.registro_de_estudantes.repositores.StudentRegisterRepository;

@RestController
public class StudentRegisterController {
    
    private StudentRegisterRepository repository;

    @Autowired
    public StudentRegisterController(StudentRegisterRepository repository) {
        this.repository = repository;
    }

	@PostMapping("/student/register")
	public String registerStudent(@RequestBody Student student) {
		this.repository.save(student);
		return "Student registered successfully";
	}
}
