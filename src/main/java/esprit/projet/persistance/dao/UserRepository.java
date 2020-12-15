package esprit.projet.persistance.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esprit.projet.persistance.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
