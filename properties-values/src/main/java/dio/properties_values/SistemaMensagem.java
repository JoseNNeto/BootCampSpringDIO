package dio.properties_values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones =
			new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada para " + nome + " com email " + email + " e telefones " + telefones);
        System.out.println("Seu cadastro foi realizado com sucesso!");
    }
}
