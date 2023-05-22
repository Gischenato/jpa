package br.pucrs.engsoft2.banco.autenticasao_de_usuarios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.User;

public interface UserAuthRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
