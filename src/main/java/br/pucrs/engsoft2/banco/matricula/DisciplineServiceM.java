package br.pucrs.engsoft2.banco.matricula;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplineServiceM {
    
    private final DisciplineRepositoryM repository;

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
