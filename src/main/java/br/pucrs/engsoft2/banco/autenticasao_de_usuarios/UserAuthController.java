package br.pucrs.engsoft2.banco.autenticasao_de_usuarios;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.User;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserAuthController {
    
    private final UserAuthService userService;

    @PostMapping("/user/auth")
    public String addNewDiscipline (@RequestBody AuthDTO user) {

        User userFound = userService.findByEmail(user.getEmail());
        if (userFound == null) {
            return "User not found!";
        }

        if (!userFound.getPassword().equals(user.getPassword())) {
            return "Wrong password!";
        }

        return "User logged!";
    }
}
