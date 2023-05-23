package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Discipline;

public interface DisciplineConsultRepository extends JpaRepository<Discipline, Long> {
    public Optional<Discipline> findByName(String name);
    
}
