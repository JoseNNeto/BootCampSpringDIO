package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{
    @Autowired
    Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma é: " + calculadora.soma(1, 2));
    }
}
