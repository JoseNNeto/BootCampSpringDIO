package dio.aula_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
