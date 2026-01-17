package fr.codingnest.pmb.user_service.service;

import fr.codingnest.pmb.user_service.entity.User;
import fr.codingnest.pmb.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class UserService {
	private final UserRepository repo;

	public UserService(UserRepository repo) {
		this.repo = repo;
	}

	public User getUserById( Long id) {
        Optional<User> user = repo.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User saveUser(User user) {
		return repo.save(user);
	}
}
