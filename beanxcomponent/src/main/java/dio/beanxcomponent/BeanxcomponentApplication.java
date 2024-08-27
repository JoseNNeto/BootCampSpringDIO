package dio.beanxcomponent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanxcomponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanxcomponentApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) {
		return args -> {
			String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"localidade\":\"São Paulo\"}";
			ViaCepResponse viaCepResponse = conversorJson.converter(json);
			System.out.println("Dados:" + viaCepResponse);
		};
	}
}
