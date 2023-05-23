package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentConsultController {
    private final StudentConsultService studentConsultService;

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return this.studentConsultService.findAll();
	}

	@GetMapping("/find/{registrationNumber}")
	public ResponseEntity<Student> getStudentByRegistrationNumber(@PathVariable String registrationNumber) {
		try {
			long regNmb = Long.parseLong(registrationNumber);
			Student student = this.studentConsultService.findById(regNmb);
			if (student == null) { return ResponseEntity.notFound().build(); }
			return ResponseEntity.ok(student);
		} catch (NumberFormatException e) {
			return ResponseEntity.badRequest().build();
		}
	}

	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable String name) {
		List<Student> students = studentConsultService.findByNameContaining(name);
		if (students.isEmpty()) { return ResponseEntity.notFound().build(); }
		return ResponseEntity.ok(students);
	}

}
