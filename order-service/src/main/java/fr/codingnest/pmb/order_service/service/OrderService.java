package fr.codingnest.pmb.order_service.service;

import fr.codingnest.pmb.order_service.entity.Order;
import fr.codingnest.pmb.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
	private final OrderRepository repo;

	public OrderService(OrderRepository repo) {
		this.repo = repo;
	}

	public List<Order> getAllOrders() {
		return repo.findAll();
	}

	public Order saveOrder(Order order) {
		return repo.save(order);
	}
}
