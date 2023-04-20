package br.pucrs.engsoft2.banco.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;

@RestController
public class DisciplineController {
    @PostMapping("/discipline/add")
    public String addNewDiscipline (@RequestBody Discipline discipline) {
        return "Discipline added!";
    }
}
