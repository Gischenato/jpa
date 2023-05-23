package br.pucrs.engsoft2.banco.cadastro_de_disciplinas;

import java.util.List;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplineRegisterService {
    private DisciplineRegisterRepository repository;

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public Discipline findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Discipline> findByClassCode(String classCode) {
        return repository.findByClassCode(classCode);
    }

}
