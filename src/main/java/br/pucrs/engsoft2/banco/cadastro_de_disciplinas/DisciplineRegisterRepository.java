package br.pucrs.engsoft2.banco.cadastro_de_disciplinas;

import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class DisciplineRegisterRepository {
    private IDisciplineRegisterRepository repository;

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
