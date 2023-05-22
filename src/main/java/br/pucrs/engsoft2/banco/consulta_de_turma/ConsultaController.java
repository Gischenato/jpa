package br.pucrs.engsoft2.banco.consulta_de_turma;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConsultaController {
    private final StudentServiceC studentService;
    private final DisciplineServiceC disciplineService;

    @GetMapping("/consulta/{name}")
    public ResponseEntity<List<StudentConsultDTO>> registerStudentToDiscipline(@PathVariable String name) {
        System.out.println(name);

        Discipline discipline = disciplineService.findByName(name);


        if (discipline == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        
        List<Student> students = discipline.getStudents();
        
        List<StudentConsultDTO> response = students.stream()
        .map(student -> new StudentConsultDTO(student.getName(), student.getAge()))
        .toList();
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
