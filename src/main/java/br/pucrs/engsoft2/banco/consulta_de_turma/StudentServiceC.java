package br.pucrs.engsoft2.banco.consulta_de_turma;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceC {
    
    private final StudentRepositoryC repository;

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public Student findByName(String name) {
        return repository.findByName(name).orElse(null);
    }
}