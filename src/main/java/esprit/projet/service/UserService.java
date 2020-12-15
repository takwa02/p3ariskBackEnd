package esprit.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import esprit.projet.persistance.dao.AnnualCriteriaRepository;
import esprit.projet.persistance.dao.UserRepository;
import esprit.projet.persistance.model.User;


@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.existsByEmail(email);
	}

	@Override
	public boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.existsByUsername(username);
	}

}
