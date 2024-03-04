import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	DecimalFormat formatter = new DecimalFormat("###,###.00");
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
		if (wage >= 0) {
			this.wage = wage;

		} else {
			System.out.println("Enter a valid wage amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}

		if (hours >= 0 && hours < 168) {
			this.hours = hours;

		} else {
			System.out.println("Enter a valid hours amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	public String getWage() {
		return formatter.format(wage);
	}

	public void setWage(double wage) {
		this.wage = wage;
		if (wage >= 0) {
			this.wage = wage;

		} else {
			System.out.println("Enter a valid wage amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}

	}

	public String getHours() {
		return formatter.format(hours);
	}

	public void setHours(double hours) {
		this.hours = hours;
		if (hours >= 0 && hours < 168) {
			this.hours = hours;

		} else {
			System.out.println("Enter a valid hours amount");
		System.out.println("Program is terminating...");
		System.exit(0);
		}
	}

	@Override
	public double getPaymentAmount() {
		double a = 0;
		if (hours <= 40) {
			a = wage * hours;
		} else if (hours > 40) {
			a = 40.0 * wage + (hours - 40) * wage * 1.5;
		}
		return a;

	}

	@Override
	public String toString() {
		return super.toString()+"\nhourly wage: $"+getWage()+"; "+"hours worked: "+ getHours()+"\npayment amount: $"+ formatter.format(getPaymentAmount());
	}

}
