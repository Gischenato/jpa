package br.pucrs.engsoft2.banco.matricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.beans.Student;
import br.pucrs.engsoft2.banco.matricula.dto.RegisterStudentDTO;
import br.pucrs.engsoft2.banco.matricula.repositories.DisciplineRepositoryM;
import br.pucrs.engsoft2.banco.matricula.repositories.StudentRepositoryM;

@RestController
public class MatriculaController {
    private final StudentRepositoryM studentRepository;
    private final DisciplineRepositoryM disciplineRepository;

    @Autowired
    public MatriculaController(StudentRepositoryM studentRepository, DisciplineRepositoryM disciplineRepository) {
        this.studentRepository = studentRepository;
        this.disciplineRepository = disciplineRepository;
    }
    

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
