package br.pucrs.engsoft2.banco.matricula.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Discipline;

@Repository
public class DisciplineRepositoryM {
    
    private IDisciplineRepositoryM repository;

    @Autowired
    public DisciplineRepositoryM(IDisciplineRepositoryM repository) {
        this.repository = repository;
    }

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
