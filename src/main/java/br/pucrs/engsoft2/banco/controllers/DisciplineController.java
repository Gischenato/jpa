package br.pucrs.engsoft2.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.repositories.DisciplineRepository;

@RestController
public class DisciplineController {
    
    private DisciplineRepository disciplineRepository;

    @Autowired
    public DisciplineController(DisciplineRepository repository) {
        this.disciplineRepository = repository;
    }

    @GetMapping("/discipline/all")
    public List<Discipline> getAllDiscipline () {
        return disciplineRepository.getAll();
    }
}
