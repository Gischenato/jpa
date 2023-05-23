package br.pucrs.engsoft2.banco.matricula;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Discipline;

public interface DisciplineRepositoryM extends JpaRepository<Discipline, Long>{
    public Optional<List<Discipline>> findByClassCode(String classCode);
}
