package br.pucrs.engsoft2.banco.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface IStudentRepositoryM extends JpaRepository<Student, Long>{
}
