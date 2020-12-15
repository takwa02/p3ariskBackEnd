package esprit.projet.service;

import java.util.List;

import esprit.projet.persistance.model.User;

public interface IUserService {

	List<User> findAll();

	void add(User user);

	void update(User user);

	User findOne(Long id);

	void delete(User user);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

	

}
