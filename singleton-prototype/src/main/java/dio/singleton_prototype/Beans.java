package dio.singleton_prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@neto.com.br");
        remetente.setNome("Netinho");
        return remetente;
    }
}
