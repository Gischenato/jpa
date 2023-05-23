package br.pucrs.engsoft2.banco.cadastro_de_disciplinas;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DisciplineRegisterController {
    
    private final DisciplineRegisterService disciplineService;

    @PostMapping("/discipline/register")
    public ResponseEntity<String> addNewDiscipline (@RequestBody Discipline discipline) {
        List<Discipline> disciplines = disciplineService.findByClassCode(discipline.getClassCode());
        
        for (Discipline d : disciplines) {
            System.out.println(d);
            if (d.getTurma().equals(discipline.getTurma())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Discipline already registered!");
            }
        }

        disciplineService.save(discipline);
        return ResponseEntity.status(HttpStatus.CREATED).body("Discipline added!");
    }
}
