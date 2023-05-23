package br.pucrs.engsoft2.banco.registro_de_estudantes;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentRegisterService {
    
    private final StudentRegisterRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public Student findByDocumentNumber(String documentNumber) {
        return repository.findByDocumentNumber(documentNumber).orElse(null);
    }
}