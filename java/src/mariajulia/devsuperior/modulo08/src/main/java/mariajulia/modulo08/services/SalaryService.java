package mariajulia.modulo08.services;

import mariajulia.modulo08.entities.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

	@Autowired
	private TaxService taxService;
	@Autowired
	private PensionService pensionService;

//	public SalaryService(TaxService taxService, PensionService pensionService) {
//		super();
//		this.taxService = taxService;
//		this.pensionService = pensionService;
//	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public PensionService getPensionService() {
		return pensionService;
	}

	public void setPensionService(PensionService pensionService) {
		this.pensionService = pensionService;
	}

	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
				- pensionService.discount(employee.getGrossSalary());
	}

}
