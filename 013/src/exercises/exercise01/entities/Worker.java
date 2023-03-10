package exercises.exercise01.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exercises.exercise01.entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

//	public void setContracts(List<HourContract> contracts) {
//		this.contracts = contracts;
//	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		// instanciou cal do tipo Calendar
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			// pegou a data do contrado (c.getDate()) e definiou como a data do Calendar
			cal.setTime(c.getDate());
			int cYear = cal.get(Calendar.YEAR);
			int cMonth = 1 + cal.get(Calendar.MONTH);
			if(year == cYear && month == cMonth) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
