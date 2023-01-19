package mariajulia.modulo08.exercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mariajulia.modulo08.exercicio.entities.Order;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;

	public double total(Order order) {
		double desconto = order.getBasic() * order.getDiscount() / 100;
		return order.getBasic() - desconto + shippingService.shipping(order);
	}

}
