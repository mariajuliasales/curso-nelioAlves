package mariajulia.modulo08.exercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mariajulia.modulo08.exercicio.entities.Order;
import mariajulia.modulo08.exercicio.services.OrderService;

@SpringBootApplication
@ComponentScan({ "mariajulia.modulo08.exercicio" })
public class ExercicioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ExercicioApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// Exemplo 01
		Order order01 = new Order(1034, 150.00, 20);

		System.out.println("Código do pedido: " + order01.getCode());
		System.out.println("Valor total do pedido: " + orderService.total(order01));
		System.out.println("-------------------------");

		// Exemplo 02
		Order order02 = new Order(2282, 800.00, 10.00);

		System.out.println("Código do pedido: " + order02.getCode());
		System.out.println("Valor total do pedido: " + orderService.total(order02));
		System.out.println("-------------------------");

		// Exemplo 03
		Order order03 = new Order(1309, 95.90, 0.0);

		System.out.println("Código do pedido: " + order03.getCode());
		System.out.println("Valor total do pedido: " + orderService.total(order03));
		System.out.println("-------------------------");

	}

}
