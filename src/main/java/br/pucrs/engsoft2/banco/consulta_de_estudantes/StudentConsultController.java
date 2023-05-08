package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentConsultController {
    private final StudentConsultService studentConsultService;

	@GetMapping("/student/all")
	public List<Student> getAllStudents() {
		return this.studentConsultService.findAll();
	}

}
