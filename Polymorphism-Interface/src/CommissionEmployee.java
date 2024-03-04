import java.text.DecimalFormat;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

    DecimalFormat formatter = new DecimalFormat("###,###.00");
    DecimalFormat formatter1 = new DecimalFormat("###,###.##");

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commisionRate;

		if (grossSales >= 0.0)
			this.grossSales = grossSales;
		else {
			System.out.println("Enter a valid gross Sales");

			System.out.println("Program is terminating...");
			System.exit(0);
		}
		if (commisionRate > 0.0 && commisionRate < 1.0)
			this.commissionRate = commisionRate;
		else {
			System.out.println("Enter a valid  commission rate");

			System.out.println("Program is terminating...");
			System.exit(0);

		}
	}

	public String getGrossSales() {
		return formatter.format(grossSales);
	}

	public void setGrossSales(double grossSales) {
		if (grossSales >= 0.0)
			this.grossSales = grossSales;
		else {
			System.out.println("Enter a valid gross Sales");

			System.out.println("Program is terminating");
			System.exit(0);
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;

		if (commissionRate > 0.0 && commissionRate < 1.0)
			this.commissionRate = commissionRate;
		else {
			System.out.println("Enter a valid  commission rate");

			System.out.println("Program is terminating");
			System.exit(0);

		}

	}

	@Override
	public double getPaymentAmount() {

		return grossSales * commissionRate;
	}

	@Override
	public String toString() {
		return  super.toString()+"\ngross sales: $"+getGrossSales()+"; "+"commission rate: "+formatter1.format(getCommissionRate());
	}

}
