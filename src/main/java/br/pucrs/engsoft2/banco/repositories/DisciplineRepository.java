package br.pucrs.engsoft2.banco.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Discipline;

@Repository
public class DisciplineRepository {
    
    private IDisciplineRepository repository;

    @Autowired
    public DisciplineRepository(IDisciplineRepository repository) {
        this.repository = repository;
    }

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public List<Discipline> getAll() {
        return repository.findAll();
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
