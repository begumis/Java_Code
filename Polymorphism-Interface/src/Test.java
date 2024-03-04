import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("###,###.00");

		int i, j;
		Payable payableObjects[] = new Payable[6];
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

		payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00);
		payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

		for (i = 0; i < 6; i++) {
			if (payableObjects[i] instanceof Invoice) {
				System.out.println(((Invoice) payableObjects[i]).toString());
				System.out.println(" ");

			}
			if (payableObjects[i] instanceof SalariedEmployee) {
				System.out.println("salaried employee:  " + ((SalariedEmployee) payableObjects[i]).toString());
				System.out.println(" ");

			}

			if (payableObjects[i] instanceof HourlyEmployee) {
				System.out.println("hourly employee: " + ((HourlyEmployee) payableObjects[i]).toString());
				System.out.println(" ");

			}

			if (payableObjects[i] instanceof CommissionEmployee
					&& !(payableObjects[i] instanceof BasePlusCommissionEmployee)) {
				System.out.println("commission employee: " + ((CommissionEmployee) payableObjects[i]).toString()
						+ "\npayment amount: $" + formatter.format(payableObjects[i].getPaymentAmount()));
				System.out.println(" ");
			}
			if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
				System.out.println("base salaried commission employee "
						+ ((BasePlusCommissionEmployee) payableObjects[i]).toString());
				((BasePlusCommissionEmployee) payableObjects[i])
						.setBaseSalary(((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary()
								+ ((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary() / 10);
				System.out.println("new base salary with 10% increase is: $"
						+ formatter.format(((BasePlusCommissionEmployee) payableObjects[i]).getBaseSalary()));
				System.out.println("payment amount: $"
						+ formatter.format(((BasePlusCommissionEmployee) payableObjects[i]).getPaymentAmount()));
				System.out.println(" ");

			}

		}

		System.out.println(" ");

		for (j = 0; j < 6; j++) {
			System.out.println("Payable object " + j + " is " + payableObjects[j].getClass().getName());

		}

	}
}
