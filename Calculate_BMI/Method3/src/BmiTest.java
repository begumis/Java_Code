import java.util.Arrays;
import java.util.Scanner;

public class BmiTest {
	static int arrayIndex = 0;
	static String name;
	static int age;
	static double weight;
	static double height;
	static Bmi BMI = new Bmi();
	static Bmi BMIbmiArray[] = new Bmi[3];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int j;

		for (j = 0; j < 3; j++) {
			System.out.println("---ENTER PERSON " + (j + 1) + "'S VALUES---");
			System.out.println("Enter name, age, weight, height: (as space separated)");
			String data = input.nextLine();
			separateData1(data);

		}
		for (j = 0; j < 3; j++) {
			System.out.println("** The BMI result for " + BMIbmiArray[j].getName() + "( age:" + BMIbmiArray[j].getAge()
					+ " weight:" + BMIbmiArray[j].getWeight() + " height:" + BMIbmiArray[j].getHeight() + " ) is "
					+ BMIbmiArray[j].getBMI());
			System.out.println(" " + BMIbmiArray[j].getStatue());

		}
	}

	public static void separateData(String data) {

		String sc1[] = data.split(" ");

		name = sc1[0] + " " + sc1[1];
		age = Integer.valueOf(sc1[2]);

		weight = Double.valueOf(sc1[3].replaceAll(",", "."));
		height = Double.valueOf(sc1[4].replaceAll(",", "."));

		BMI = new Bmi(name, age, weight, height);

		BMIbmiArray[arrayIndex] = new Bmi();
		BMIbmiArray[arrayIndex].setName(BMI.getName());
		BMIbmiArray[arrayIndex].setAge(BMI.getAge());
		BMIbmiArray[arrayIndex].setWeight(BMI.getWeight());
		BMIbmiArray[arrayIndex].setHeight(BMI.getHeight());

		arrayIndex++;

	}

	public static void separateData1(String data) {
		String a;
		int x, y, z, t;
		String b;
//a=data.indexOf(" ");
		x = data.indexOf(" ");
		y = data.indexOf(" ", x + 1);
		z = data.indexOf(" ", y + 1);
		t = data.indexOf(" ", z + 1);

		a = data.substring(0, x);
		b = data.substring(x, y);
		name = a + b;

		String age1 = data.substring(y + 1, z);

		String weight1 = data.substring(z + 1, t);

		String height1 = data.substring(t);

		age = Integer.valueOf(age1);

		weight = Double.valueOf(weight1);

		height = Double.valueOf(height1);

		BMI = new Bmi(name, age, weight, height);

		BMIbmiArray[arrayIndex] = new Bmi();
		BMIbmiArray[arrayIndex].setName(BMI.getName());
		BMIbmiArray[arrayIndex].setAge(BMI.getAge());
		BMIbmiArray[arrayIndex].setWeight(BMI.getWeight());
		BMIbmiArray[arrayIndex].setHeight(BMI.getHeight());

		arrayIndex++;
	}
}
