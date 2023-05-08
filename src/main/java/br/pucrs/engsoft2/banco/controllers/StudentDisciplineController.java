package br.pucrs.engsoft2.banco.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.beans.RegisterStudentDTO;
import br.pucrs.engsoft2.banco.beans.Student;
import br.pucrs.engsoft2.banco.repositories.DisciplineService;
import br.pucrs.engsoft2.banco.repositories.StudentService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentDisciplineController {
    private DisciplineService disciplineService;
    private StudentService studentService;

    @PostMapping("/discipline/register-student")
    public ResponseEntity<String> registerStudentToDiscipline(@RequestBody RegisterStudentDTO body) {
        Discipline discipline = disciplineService.findById(body.discipline_id);

        if (discipline == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Discipline not found");
        
        Student student = studentService.findById(body.student_id);
        if (student == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");

        List<Student> studentsInTheDiscipline = discipline.getStudents();
        if (studentsInTheDiscipline.contains(student)) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student is already registered in this discipline");

        studentsInTheDiscipline.add(student);
        discipline.setStudents(studentsInTheDiscipline);

        disciplineService.save(discipline);

        return ResponseEntity.status(HttpStatus.CREATED).body("Student registered in discipline successfully");
    }
}
