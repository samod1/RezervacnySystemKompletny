package sk.mtf.is.rezervacnySystem.repository;

import org.springframework.data.repository.CrudRepository;
import sk.mtf.is.rezervacnySystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);

    List<User> findByMeno(String meno);

    List<User> findByPriezvisko(String priezvisko);
}
