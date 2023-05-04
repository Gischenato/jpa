package br.pucrs.engsoft2.banco.cadastro_de_disciplinas.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.cadastro_de_disciplinas.repositories.DisciplineRegisterRepository;

@RestController
public class DisciplineRegisterController {
    
    private DisciplineRegisterRepository disciplineRepository;

    @Autowired
    public DisciplineRegisterController(DisciplineRegisterRepository repository) {
        this.disciplineRepository = repository;
    }

    @PostMapping("/discipline/register")
    public String addNewDiscipline (@RequestBody Discipline discipline) {
        disciplineRepository.save(discipline);
        return "Discipline added!";
    }
}
