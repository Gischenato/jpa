package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface IStudentConsultRepository extends JpaRepository<Student, Long> {
    
}
