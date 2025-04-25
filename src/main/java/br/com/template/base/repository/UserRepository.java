package br.com.template.base.repository;
import br.com.template.base.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends
        JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);
}
