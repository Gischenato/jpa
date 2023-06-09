package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import java.util.LinkedList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DisciplineConsultController {
    private final DisciplineConsultService disciplineConsultService;

	@GetMapping("/discipline/all")
	public ResponseEntity<List<Discipline>> getAllDisciplines() {
		return ResponseEntity.status(HttpStatus.OK).body(disciplineConsultService.findAll());
	}

	@GetMapping("/discipline/class")
	public ResponseEntity<List<StudentConsultDTO>> getAllDisciplines(@RequestBody FindStudentInClassDTO body) {
		String classCode = body.getClassCode();
		String turma = body.getTurma();

        Discipline discipline = disciplineConsultService.findByClassCodeAndTurma(classCode, turma);

		List<StudentConsultDTO> response = new LinkedList<StudentConsultDTO>();
        if (discipline == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        
        List<Student> students = discipline.getStudents();
        
        response = students.stream()
        .map(student -> new StudentConsultDTO(student.getName(), student.getRegistrationNumber()))
        .toList();
        
        return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
