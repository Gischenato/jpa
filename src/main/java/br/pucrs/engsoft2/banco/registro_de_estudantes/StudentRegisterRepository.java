package br.pucrs.engsoft2.banco.registro_de_estudantes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.Student;

public interface StudentRegisterRepository extends JpaRepository<Student, Long> {
    public Optional<Student> findByDocumentNumber(String documentNumber);
}
