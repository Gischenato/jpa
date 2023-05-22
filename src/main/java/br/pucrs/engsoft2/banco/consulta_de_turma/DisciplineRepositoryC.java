package br.pucrs.engsoft2.banco.consulta_de_turma;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Discipline;

public interface DisciplineRepositoryC extends JpaRepository<Discipline, Long>{
    public Optional<Discipline> findByName(String name);
}
