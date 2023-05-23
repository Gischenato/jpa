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
    private final StudentServiceM studentService;
    private final DisciplineServiceM disciplineService;

    @PostMapping("/matricula")
    public ResponseEntity<String> registerStudentToDiscipline(@RequestBody RegisterStudentDTO body) {
        List<Discipline> discipline = disciplineService.findByClassCode(body.discipline_code);

        if (discipline.size() == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Discipline not found");
        
        Student student = studentService.findByMatricula(body.student_matricula);
        if (student == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");

        Discipline toRegister = null;

        for (Discipline d : discipline) {
            if (d.getStudents().contains(student)) return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student is already registered in this discipline");
            if (d.getTurma().equals(body.turma)) toRegister = d;
        }
    
        if (toRegister == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Discipline (turma) not found"); 
        
        var studentsInTheDiscipline = toRegister.getStudents();
        studentsInTheDiscipline.add(student);
        toRegister.setStudents(studentsInTheDiscipline);
        disciplineService.save(toRegister);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student registered in discipline successfully");
    }
}

/*
 
[
    {
        "id": 1,
        "name": "historia",
        "horario": "A",
        "turma": "10",
        "classCode": "1020A",
    },
    {
        "id": 2,
        "name": "historia",
        "horario": "A",
        "turma": "15",
        "classCode": "1020A",
    },
    {
        "id": 3,
        "name": "historia",
        "horario": "C",
        "turma": "20",
        "classCode": "1020A",
    },
    {
        "id": 52,
        "name": "matematica",
        "horario": "A",
        "turma": "10",
        "classCode": "1030A",
    },
    {
        "id": 53,
        "name": "matematica",
        "horario": "B",
        "turma": "15",
        "classCode": "1030A",
    },
    {
        "id": 54,
        "name": "fisica",
        "horario": "B",
        "turma": "10",
        "classCode": "1040B",
    },
    {
        "id": 55,
        "name": "fisica",
        "horario": "C",
        "turma": "15",
        "classCode": "1040B",
    }
]

[
    {
        "registrationNumber": 1,
        "name": "jaime",
        "documentNumber": "102050",
        "disciplines": []
    },
    {
        "registrationNumber": 2,
        "name": "giovanna",
        "documentNumber": "102045",
        "disciplines": []
    },
    {
        "registrationNumber": 3,
        "name": "gabriel",
        "documentNumber": "102040",
        "disciplines": []
    },
    {
        "registrationNumber": 4,
        "name": "joao",
        "documentNumber": "102035",
        "disciplines": []
    },
    {
        "registrationNumber": 5,
        "name": "romanini",
        "documentNumber": "102030",
        "disciplines": []
    }
]


 */