package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import java.util.List;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplineConsultService {
    private DisciplineConsultRepository repository;

    public void save(Discipline discipline) {
        repository.save(discipline);
    }

    public List<Discipline> findAll() {
        return repository.findAll();
    }

    public Discipline findByName(String name) {
        return repository.findByName(name).orElse(null);
    }

    public Discipline findByClassCodeAndTurma(String classCode, String turma) {
        return repository.findByClassCodeAndTurma(classCode, turma).orElse(null);
    }
}
