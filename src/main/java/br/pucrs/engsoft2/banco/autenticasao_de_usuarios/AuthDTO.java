package br.pucrs.engsoft2.banco.autenticasao_de_usuarios;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class AuthDTO {
    String email;
    String password;
}
