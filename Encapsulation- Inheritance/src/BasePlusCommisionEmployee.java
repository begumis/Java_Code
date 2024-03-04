
public class BasePlusCommisionEmployee extends CommisionEmployee {
	private double baseSalary;

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		this.baseSalary = baseSalary;
		if (baseSalary <= 0.0) {
			System.out.println("Program is terminating...");
			System.exit(0);
		}
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;

		if (baseSalary <= 0.0) {
			System.out.println("Program is terminating...");
			System.exit(0);
		}

	}

	public double earnings() {
		double earnings = baseSalary + super.earnings();
		return earnings;
	}

	public String toString() {
		return super.toString() + "\nBase Salary:  " + getBaseSalary();

	}
}
