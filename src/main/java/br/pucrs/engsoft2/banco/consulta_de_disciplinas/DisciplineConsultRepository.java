package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Discipline;

public interface DisciplineConsultRepository extends JpaRepository<Discipline, Long> {
    
}
