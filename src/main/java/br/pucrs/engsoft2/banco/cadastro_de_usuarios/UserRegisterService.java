package br.pucrs.engsoft2.banco.cadastro_de_usuarios;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.User;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserRegisterService {
    private UserRegisterRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public User findById(long id) {
        return repository.findById(id).orElse(null);
    }

}
