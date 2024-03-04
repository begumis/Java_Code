
public class Bmi {
	private String name;
	private int age;
	private double weight;
	private double height;
	private double result;
	static final double KILOGRAMS_PER_POUND = 0.45359237;
	static final double METERS_PER_INCH = 0.0254;

	public Bmi() {
		name = "John black";
		age = 25;
		weight = 100;
		height = 50;
	}

	public Bmi(String name1, double weight1, double height1) {
		age = 20;
		name = name1;
		height = height1;
		weight = weight1;

	}

	public Bmi(String name2, int age2, double weight2, double height2) {

		age = age2;
		name = name2;
		height = height2;
		weight = weight2;
	}

	public void setName(String name3) {
		name = name3;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double weight3) {
		this.weight = weight3;
	}

	public double getWeight() {
		return weight;

	}

	public void setHeight(double height3) {
		this.height = height3;
	}

	public double getHeight() {
		return height;
	}

	public double getBMI() {
		double a = weight * KILOGRAMS_PER_POUND;
		double b = height * METERS_PER_INCH;
		result = a / (b * b);
		return result;
	}

	public String getStatue() {
		String getStatue = null;
		if (result < 18.5)
			getStatue = "Underweight";

		if (result >= 18.5 && result < 25.0)
			getStatue = "Normal";

		if (result >= 25.0 && result < 30.0)
			getStatue = "Overweight";

		if (result >= 30.0)
			getStatue = "Obese";
		return getStatue;
	}

}