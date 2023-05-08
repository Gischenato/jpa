package br.pucrs.engsoft2.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import br.pucrs.engsoft2.banco.repositories.DisciplineRepository;
import br.pucrs.engsoft2.banco.repositories.DisciplineService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DisciplineController {
    
    private final DisciplineService disciplineService;

    @GetMapping("/discipline/all")
    public List<Discipline> getAllDiscipline () {
        return disciplineService.getAll();
    }
}
