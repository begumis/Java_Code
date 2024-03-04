import java.text.DecimalFormat;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	DecimalFormat formatter = new DecimalFormat("###,###.00");
	DecimalFormat formatter1 = new DecimalFormat("###,###.##");

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
		if (baseSalary <= 0.0) {
			System.out.println("Enter a valid base salary");

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
			System.out.println("Enter a valid base salary");

			System.out.println("Program is terminating...");
			System.exit(0);
		}

	}

	@Override
	public double getPaymentAmount() {

		return baseSalary + super.getPaymentAmount();
	}

	@Override
	public String toString() {

		return  super.toString()+ "; " + "base salary: $"
				+ formatter.format(getBaseSalary());
	}

}
