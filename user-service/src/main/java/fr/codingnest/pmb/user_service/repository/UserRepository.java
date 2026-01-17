package fr.codingnest.pmb.user_service.repository;

import fr.codingnest.pmb.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
