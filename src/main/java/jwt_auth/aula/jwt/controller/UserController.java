package jwt_auth.aula.jwt.controller;

import jakarta.validation.Valid;
import jwt_auth.aula.jwt.model.User;
import jwt_auth.aula.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @GetMapping("/users")
    public List<User> getAll(){
        return repository.findAll();
    }

    // Rota para cadastro de usuário
    @PostMapping("/users")
    public String saveUser(@Valid @RequestBody User body) {
        // Verifica se o usuário já existe
        Optional<User> existingUser = Optional.ofNullable(repository.findByUsername(body.getUsername()));
        if (existingUser.isPresent()) {
            throw new RuntimeException("Usuário já existe!");
        }

        // Criptografa a senha
        body.setPassword(encoder.encode(body.getPassword()));

        // Define o papel (ROLE) do usuário (exemplo: "USER")
        if (body.getRoles() == null || body.getRoles().isEmpty()) {
            body.setRoles(List.of("ROLE_USERS"));
        }

        // Salva o usuário
        repository.save(body);

        return "Usuário criado com sucesso!";
    }


}
