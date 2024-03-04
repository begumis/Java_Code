import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int i, j;
		String nameArray[] = new String[3];
		int ageArray[] = new int[3];
		double weightArray[] = new double[3];
		double heightArray[] = new double[3];
		String interpretArray[] = new String[3];

		Scanner input = new Scanner(System.in);

		for (i = 0; i < 3; i++) {

			System.out.println("---ENTER PERSON " + (i + 1) + "'S VALUES---");
			System.out.println("Enter name, age, weight, height: (as space separated)");
			String data = input.nextLine();
			for (j = 0; j < 5; j++) {

				String sc1[] = data.split(" ");

				nameArray[i] = sc1[0] + " " + sc1[1];
				ageArray[i] = Integer.valueOf(sc1[2]);

				double weight1 = Double.valueOf(sc1[3].replaceAll(",", "."));
				double height1 = Double.valueOf(sc1[4].replaceAll(",", "."));
				weightArray[i] = weight1;
				heightArray[i] = height1;

				

			}

		}
		for (i = 0; i < 3; i++) {
			BmiFunctions result = new BmiFunctions();
			double res = result.calculateBMI(weightArray[i], heightArray[i]);

			interpretArray[i] = result.interpretBMI(res);
			System.out.println("** The BMI result for " + nameArray[i] + "( age:" + ageArray[i] + " weight:" + weightArray[i] + " height:" + heightArray[i] + " ) is " + res);
			System.out.println("" + interpretArray[i]);
		}

	}

}
