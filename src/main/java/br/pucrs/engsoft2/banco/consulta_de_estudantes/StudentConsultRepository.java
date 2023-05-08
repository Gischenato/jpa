package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentConsultRepository {
    private IStudentConsultRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }
    
}
