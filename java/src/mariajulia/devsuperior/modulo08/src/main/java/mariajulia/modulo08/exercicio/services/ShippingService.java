package mariajulia.modulo08.exercicio.services;

import org.springframework.stereotype.Service;

import mariajulia.modulo08.exercicio.entities.Order;

@Service
public class ShippingService {

	double shipping(Order order) {

		double desconto = order.getBasic();

		if (desconto < 100) {
			return 20;
		} else if (desconto < 200) {
			return 12;
		} else {
			return 0;
		}

	}

}
