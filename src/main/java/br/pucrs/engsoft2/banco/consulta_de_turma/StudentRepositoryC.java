package br.pucrs.engsoft2.banco.consulta_de_turma;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface StudentRepositoryC extends JpaRepository<Student, Long>{
    public Optional<Student> findByName(String name);
}
