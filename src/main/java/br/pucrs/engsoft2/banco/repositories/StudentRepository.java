package br.pucrs.engsoft2.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
