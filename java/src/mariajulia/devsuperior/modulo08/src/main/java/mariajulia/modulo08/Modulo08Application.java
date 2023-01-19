package mariajulia.modulo08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mariajulia.modulo08.entities.Employee;
import mariajulia.modulo08.services.SalaryService;

@SpringBootApplication
@ComponentScan({ "mariajulia" })
public class Modulo08Application implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

//	public Modulo08Application(SalaryService salaryService) {
//		super();
//		this.salaryService = salaryService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(Modulo08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee("Maria Julia", 4000.00);

		System.out.println(salaryService.netSalary(employee));
	}

}
