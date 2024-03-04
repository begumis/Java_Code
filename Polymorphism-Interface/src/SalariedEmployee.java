import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	DecimalFormat formatter = new DecimalFormat("###,###.00");

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
		if (weeklySalary >= 0) {
			this.weeklySalary = weeklySalary;

		} else {
			System.out.println("Enter a valid weekly salary amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	public String getWeeklySalary() {
		return formatter.format(weeklySalary);

	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
		if (weeklySalary >= 0) {
			this.weeklySalary = weeklySalary;

		} else {
			System.out.println("Enter a valid weekly salary amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	@Override
	public String toString() {
		return super.toString()+"\nweekly salary: $" + getWeeklySalary() + "\npayment amount: $"
				+ formatter.format(getPaymentAmount());

	}

	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}

}
