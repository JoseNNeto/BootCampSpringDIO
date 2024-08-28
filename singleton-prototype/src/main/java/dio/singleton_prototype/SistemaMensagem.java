package dio.singleton_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente tech;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarBoasVindas() {
        tech.setEmail("tech@neto.com.br");
        System.out.println(tech);
        System.out.println("Bem-vindo ao sistema");
    }
}
