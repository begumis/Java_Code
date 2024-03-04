
public class BmiFunctions {
	static double result;

	public static double calculateBMI(double weight, double height) {
		double a, b;
		a = weight * 0.45359237;
		b = height * 0.0254;
		result = a / (b * b);
		return result;
	}

	public static String interpretBMI(double bmi) {
		String interpretBMI = null;
		if (result < 18.5)
			interpretBMI = "Underweight";

		if (result >= 18.5 && result < 25.0)
			interpretBMI = "Normal";

		if (result >= 25.0 && result < 30.0)
			interpretBMI = "Overweight";

		if (result >= 30.0)
			interpretBMI = "Obese";
		return interpretBMI;

	}
}
