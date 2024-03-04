

import java.util.*;

public class starloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter initial star number:(Enter q to quit)");
			String yenı = input.next();
			char ch = 'q';
			String ch1 = Character.toString(ch);

			if (yenı.equals(ch1)) {
				System.out.println("Program Terminates");
				System.exit(0);

			}

			else {
				int number2 = Integer.valueOf(yenı);
				int i;
				int counter;
				for (counter = 1; counter <= number2 / 2; counter++) {
					for (i = 1; i <= number2; i++) {
						if (i > number2 + 1 - counter || i <= counter - 1) {
							System.out.print(" ");

						} else {
							System.out.print("*");

						}

					}
					System.out.println();

				}

				for (counter = (number2 / 2) + 1; counter <= number2; counter++) {
					for (i = 1; i <= number2; i++) {
						if (i < number2 + 1 - counter || i > counter) {
							System.out.print(" ");

						} else {
							System.out.print("*");

						}
					}

					System.out.println();
				}

			}

		}
	}

}
