package br.pucrs.engsoft2.banco.repositories;

import java.util.List;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplineService {
    
    private DisciplineRepository repository;

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
