package br.pucrs.engsoft2.banco.repositories;

import org.springframework.stereotype.Service;

import java.util.List;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    
    private final StudentRepository repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }
}