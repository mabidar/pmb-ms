package fr.codingnest.pmb.order_service.controller;

import fr.codingnest.pmb.order_service.dto.User;
import fr.codingnest.pmb.order_service.entity.Order;
import fr.codingnest.pmb.order_service.service.OrderService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final RestTemplate restTemplate;
    private final OrderService service;

    public OrderController(RestTemplate restTemplate, OrderService service) {
        this.restTemplate = restTemplate;
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable Long userId) {
        return restTemplate.getForObject("http://user-service:8081/users/" + userId, User.class);
    }

	@GetMapping
	public List<Order> getOrders() {
		return service.getAllOrders();
	}

	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
}
