package br.pucrs.engsoft2.banco.cadastro_de_usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pucrs.engsoft2.banco.beans.User;

public interface UserRegisterRepository extends JpaRepository<User, Long> {
    
}
