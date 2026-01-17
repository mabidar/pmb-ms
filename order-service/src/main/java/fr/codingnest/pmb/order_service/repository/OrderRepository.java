package fr.codingnest.pmb.order_service.repository;

import fr.codingnest.pmb.order_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
