package br.pucrs.engsoft2.banco.autenticasao_de_usuarios;

import org.springframework.stereotype.Service;

import br.pucrs.engsoft2.banco.beans.User;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserAuthService {
    private UserAuthRepository repository;

    public User findById(long id) {
        return repository.findById(id).orElse(null);
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElse(null);
    }

}
