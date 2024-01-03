package com.lucasalmeida.primeirodesafio.services;

import com.lucasalmeida.primeirodesafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double total =
				order.getBasic() - order.getBasic() * (order.getDiscount() / 100);

		if (total < 100.00) {
			total += 20;
		} else if (total < 200.0) {
			total += 12;
		} else if (total >= 200.0) {
			return total;
		}

		return total;
	}
}
