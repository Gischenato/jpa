package br.pucrs.engsoft2.banco.matricula;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface StudentRepositoryM extends JpaRepository<Student, Long>{
}
