package br.pucrs.engsoft2.banco.matricula;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MatriculaController {
    private final StudentServiceM studentRepository;
    private final DisciplineServiceM disciplineRepository;

    @PostMapping("/matricula")
    public ResponseEntity<String> registerStudentToDiscipline(@RequestBody RegisterStudentDTO body) {
        Discipline discipline = disciplineRepository.findById(body.discipline_id);

        if (discipline == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Discipline not found");
        
        Student student = studentRepository.findById(body.student_id);
        if (student == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");

        List<Student> studentsInTheDiscipline = discipline.getStudents();
        if (studentsInTheDiscipline.contains(student)) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student is already registered in this discipline");

        studentsInTheDiscipline.add(student);
        discipline.setStudents(studentsInTheDiscipline);

        disciplineRepository.save(discipline);

        return ResponseEntity.status(HttpStatus.CREATED).body("Student registered in discipline successfully");
    }
}
