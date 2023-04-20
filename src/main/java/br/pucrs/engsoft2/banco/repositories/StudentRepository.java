package br.pucrs.engsoft2.banco.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import br.pucrs.engsoft2.banco.beans.Student;

@Repository
public class StudentRepository {
    
    private final IStudentRepository repository;

    @Autowired
    public StudentRepository(IStudentRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }
}