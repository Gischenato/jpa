package br.pucrs.engsoft2.banco.controllers;


import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.repositories.DisciplineService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DisciplineController {
    
    private final DisciplineService disciplineService;

}
