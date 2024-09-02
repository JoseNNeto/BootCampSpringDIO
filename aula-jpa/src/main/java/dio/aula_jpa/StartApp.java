package dio.aula_jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_jpa.model.User;
import dio.aula_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.filtrarPorNome("Neto");
        users.forEach(System.out::println);
    }
    
    public void insertUser(){
        User user = new User();
        user.setName("Neto");
        user.setUsername("netinho");
        user.setPassword("netinho123");

        userRepository.save(user);

        for(User u: userRepository.findAll()){
            System.out.println(u);
        }
    }
}
