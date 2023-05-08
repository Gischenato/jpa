package br.pucrs.engsoft2.banco.matricula;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceM {
    
    private final StudentRepositoryM repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }
}