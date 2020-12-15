package esprit.projet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esprit.projet.persistance.model.User;
import esprit.projet.service.IUserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	IUserService UserService;
	
	@GetMapping("/list")
	public List<User> findAll(){
		
		return UserService.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User emp) {
		UserService.add(emp);
	}
	@PutMapping("/update")
	public User update(@RequestBody User emp) {
		UserService.update(emp);
				return emp;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
	User emp=	UserService.findOne(id);
		UserService.delete(emp);
	}
}