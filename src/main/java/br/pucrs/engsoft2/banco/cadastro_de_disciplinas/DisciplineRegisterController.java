package br.pucrs.engsoft2.banco.cadastro_de_disciplinas;

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
    public String addNewDiscipline (@RequestBody Discipline discipline) {
        disciplineService.save(discipline);
        return "Discipline added!";
    }
}
