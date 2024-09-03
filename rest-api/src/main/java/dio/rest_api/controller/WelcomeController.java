package dio.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String bemVindo() {
        return "Bem-vindo à API REST de Netinho!";
    }
}
