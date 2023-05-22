package br.pucrs.engsoft2.banco.cadastro_de_usuarios;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.User;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserRegisterController {
    
    private final UserRegisterService userService;

    @PostMapping("/user/register")
    public String addNewDiscipline (@RequestBody User user) {
        userService.save(user);
        return "User registerd!";
    }
}
