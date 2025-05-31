package ch25_3.data;
import org.springframework.data.repository.CrudRepository;
import ch25_3.User;

public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String username);
}
