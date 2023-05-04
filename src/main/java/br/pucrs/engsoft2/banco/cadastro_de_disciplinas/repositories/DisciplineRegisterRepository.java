package br.pucrs.engsoft2.banco.cadastro_de_disciplinas.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Discipline;

@Repository
public class DisciplineRegisterRepository {
    private IDisciplineRegisterRepository repository;

    @Autowired
    public DisciplineRegisterRepository(IDisciplineRegisterRepository repository) {
        this.repository = repository;
    }

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
