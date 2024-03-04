
public class InheritanceTest {

	public static void main(String[] args) {

		BasePlusCommisionEmployee employee = new BasePlusCommisionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

		System.out.println("Employee information obtained by get method and earnings:");
		System.out.println(" ");
		System.out.println("First name:  " + employee.getFirstName());
		System.out.println("Last name:  " + employee.getLastName());
		System.out.println("Social Security Number:  " + employee.getSocialSecurityNumber());
		System.out.println("Gross Sales  : " + employee.getGrossSales());
		System.out.println("Commision Rate:  " + employee.getCommisionRate());
		System.out.println("Base Salary:  " + employee.getBaseSalary());
		System.out.println("Earnings:  " + employee.earnings());

		employee.setBaseSalary(1000.00);
		System.out.println(" "); 

		System.out.println("Updated Employee information obtained by toString and earnings:");
		System.out.println(" ");

		System.out.println(employee.toString());

		System.out.println("Earnings: " + employee.earnings());

	}

}
