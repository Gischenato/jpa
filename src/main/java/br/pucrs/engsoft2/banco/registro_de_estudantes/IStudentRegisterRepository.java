package br.pucrs.engsoft2.banco.registro_de_estudantes;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface IStudentRegisterRepository extends JpaRepository<Student, Long> {
}
