package br.pucrs.engsoft2.banco.registro_de_estudantes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentRegisterController {
    
    private final StudentRegisterService service;

	@PostMapping("/student/register")
	public String registerStudent(@RequestBody Student student) {
		service.save(student);
		return "Student registered successfully";
	}
}
