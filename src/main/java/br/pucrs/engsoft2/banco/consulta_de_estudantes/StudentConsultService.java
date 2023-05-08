package br.pucrs.engsoft2.banco.consulta_de_estudantes;

import java.util.List;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.Student;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentConsultService {
    private StudentConsultRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }
    
}
