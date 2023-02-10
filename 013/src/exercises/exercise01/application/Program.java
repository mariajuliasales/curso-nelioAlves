package exercises.exercise01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.exercise01.entities.Department;
import exercises.exercise01.entities.HourContract;
import exercises.exercise01.entities.Worker;
import exercises.exercise01.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String departmentName = scanner.nextLine();
		System.out.print("Nome: ");
		String workerName = scanner.nextLine();
		System.out.print("Level: ");
		String workerLevel = scanner.nextLine();
		System.out.print("Entre com o salário base: ");
		double baseSalary = scanner.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("Quantos contratos? ");
		int n = scanner.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scanner.next());
			System.out.print("Valor por hora: ");
			double valuePurHours = scanner.nextDouble();
			System.out.print("Duração: ");
			int hours = scanner.nextInt();

			HourContract contract = new HourContract(contractDate, valuePurHours, hours);
			worker.addContract(contract);
		}

		System.out.print("Entre com o mes e o ano para calcular (DD/MM/YYYY): ");
		String monthAndYear = scanner.next();
		System.out.println();

		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Quando ganhou em: " + monthAndYear);
		System.out.println(worker.income(year, month));

		scanner.close();
	}

}
