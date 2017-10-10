package co.akwad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import co.akwad.models.User;

/**
 * Created by ibraheam
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);
}
