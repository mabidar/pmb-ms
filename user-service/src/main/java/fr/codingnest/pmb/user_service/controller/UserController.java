package fr.codingnest.pmb.user_service.controller;

import fr.codingnest.pmb.user_service.entity.User;
import fr.codingnest.pmb.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserService service;

	public UserController(UserService service) {
		this.service = service;
	}
	
    // GET /user/{id}
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
            return service.getUserById(id);
        
    }
	
	@GetMapping
	public List<User> getUsers() {
		return service.getAllUsers();
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		return service.saveUser(user);
	}
}
