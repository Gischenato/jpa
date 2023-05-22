package br.pucrs.engsoft2.banco.consulta_de_turma;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplineServiceC {
    
    private final DisciplineRepositoryC repository;

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public Discipline findByName(String name) {
        return repository.findByName(name).orElse(null);
    }
}
