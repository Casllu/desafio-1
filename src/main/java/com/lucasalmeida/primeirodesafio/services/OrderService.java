package com.lucasalmeida.primeirodesafio.services;

import com.lucasalmeida.primeirodesafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;
	public double total(Order order) {
		return shippingService.shipment(order);

	}
}
