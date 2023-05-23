package br.pucrs.engsoft2.banco.registro_de_estudantes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> registerStudent(@RequestBody Student student) {
		Student alreadyRegisteredStudent = service.findByDocumentNumber(student.getDocumentNumber());
		if (alreadyRegisteredStudent != null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student already registered");
		}
		service.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body("Student registered");
	}
}
