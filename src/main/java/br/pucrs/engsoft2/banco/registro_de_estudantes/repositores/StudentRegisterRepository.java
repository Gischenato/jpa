package br.pucrs.engsoft2.banco.registro_de_estudantes.repositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.pucrs.engsoft2.banco.beans.Student;

@Repository
public class StudentRegisterRepository {
    
    private final IStudentRegisterRepository repository;

    @Autowired
    public StudentRegisterRepository(IStudentRegisterRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public Student findById(long id) {
        return repository.findById(id).orElse(null);
    }
}