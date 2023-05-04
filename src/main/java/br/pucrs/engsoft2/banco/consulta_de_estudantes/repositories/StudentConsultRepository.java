package br.pucrs.engsoft2.banco.consulta_de_estudantes.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Student;

@Repository
public class StudentConsultRepository {
    private IStudentConsultRepository repository;

    @Autowired
    public StudentConsultRepository(IStudentConsultRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
    
}
