package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;

public class MyApp implements CommandLineRunner {
    @Autowired
    Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculadora.soma(1, 2));
    }
    
}
