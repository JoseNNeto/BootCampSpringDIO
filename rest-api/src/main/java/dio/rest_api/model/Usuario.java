package dio.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Integer id;
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}
