package br.pucrs.engsoft2.banco.matricula.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Student;

@Repository
public class StudentRepositoryM {
    
    private final IStudentRepositoryM repository;

    @Autowired
    public StudentRepositoryM(IStudentRepositoryM repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }
}