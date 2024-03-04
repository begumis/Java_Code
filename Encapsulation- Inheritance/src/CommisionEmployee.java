
public class CommisionEmployee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;

	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;

		if (grossSales >= 0.0)
			this.grossSales = grossSales;
		else {
			System.out.println("Program is terminating...");
			System.exit(0);
		}
		if (commisionRate > 0.0 && commisionRate < 1.0)
			this.commisionRate = commisionRate;
		else {
			System.out.println("Program is terminating...");
			System.exit(0);

		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales >= 0.0)
			this.grossSales = grossSales;
		else {
			System.out.println("Program is terminating");
			System.exit(0);
		}
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		if (commisionRate > 0.0 && commisionRate < 1.0)
			this.commisionRate = commisionRate;
		else {
			System.out.println("Program is terminating");
			System.exit(0);

		}

	}

	public double earnings() {
		double earnings = grossSales * commisionRate;
		return earnings;

	}

	public String toString() {
		return "First Name:  " + getFirstName() + "\nLast Name:  " + getLastName() + "\nSocial Security Number:  "
				+ getSocialSecurityNumber() + "\nGross Sales:  " + getGrossSales() + "\nCommision Rate:  "
				+ getCommisionRate();

	}

}
