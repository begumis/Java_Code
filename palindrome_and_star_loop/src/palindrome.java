

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a 7-digit number: ( Write '-1' to quit)");

			int number = input.nextInt();
			int remainder;
			int tempNum = 0;
			int originalNumber = number;
			int i = 0;

			if (number == -1) {
				System.out.println("Program is terminating..");
				System.exit(0);

			}
			while (number != 0) {
				remainder = number % 10;
				tempNum = tempNum * 10 + remainder;
				number = number / 10;
				i = i + 1;
			}
			if (i != 7) {
				System.out.println("Number must be 7 digits. ");

			}
			if (i == 7) {
				if (tempNum == originalNumber) {
					System.out.println("Palindrome number! ");

				}

				else {
					System.out.println("Not palindrome number! ");
				}
			}

		}

	}

}

