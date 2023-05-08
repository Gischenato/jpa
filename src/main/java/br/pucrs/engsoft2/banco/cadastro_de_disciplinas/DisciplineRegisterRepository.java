package br.pucrs.engsoft2.banco.cadastro_de_disciplinas;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Discipline;

public interface DisciplineRegisterRepository extends JpaRepository<Discipline, Long> {
    
}
