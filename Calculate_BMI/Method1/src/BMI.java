import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double a;
		double b;

		System.out.println("Enter weight,height: ( as a space separated)");

		String data = input.nextLine();
		Scanner sc = new Scanner(data).useDelimiter(" ");

		while (sc.hasNext()) {
			String weight = sc.next();
			String height = sc.next();

			double weight1 = Double.valueOf(weight.replaceAll(",", "."));
			double height1 = Double.valueOf(height.replaceAll(",", "."));
			a = weight1 * 0.45359237;
			b = height1 * 0.0254;

			double result = a / (b * b);
			System.out.println("BMI is " + result);

			if (result < 18.5)
				System.out.println("Underweight");

			if (result >= 18.5 && result < 25.0)
				System.out.println("Normal");

			if (result >= 25.0 && result < 30.0)
				System.out.println("Overweight");

			if (result >= 30.0)
				System.out.println("Obese");

		}
	}

}
