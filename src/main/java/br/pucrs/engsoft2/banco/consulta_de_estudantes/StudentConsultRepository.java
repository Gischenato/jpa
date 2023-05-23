package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface StudentConsultRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
}
