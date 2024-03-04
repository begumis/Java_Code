
import java.util.*;

import java.util.Arrays;
import java.util.Scanner;

public class AtmMachine {
	static double balance[] = new double[10];

	static {

		for (int id = 0; id < 10; id++) {
			balance[id] = 100.0;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a id:");
		int id = input.nextInt();

		while (true) {

			int[] users = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int sayiIndex = Arrays.binarySearch(users, id);

			if (sayiIndex >= 0) {
				menuDisplay();
				System.out.println("Enter a choice:");
				int choice = input.nextInt();
				if (choice == 1) {
					checkbalance(id);
				}
				if (choice == 2) {
					withdraw(id);
				}
				if (choice == 3) {
					deposit(id);
				}
				if (choice == 4) {
					exit(id);
				}

			} else {
				System.out.println("Enter a valid id:(0-9)");
				id = input.nextInt();

			}

		}

	}

	public static void checkbalance(int id) {

		System.out.println("your balance is =" + balance[id]);

	}

	public static void withdraw(int id) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount to withdraw");
		int amount = input.nextInt();
		if (balance[id] >= amount) {
			balance[id] = balance[id] - amount;

		}

		else {
			System.out.println("your balance is :" + balance[id]);
			System.out.println("withdraw amount is too large.");
			System.out.println("you are redirected to deposit menu");
			deposit(id);

		}

	}

	public static void deposit(int id) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount to deposite");
		int amount = input.nextInt();
		balance[id] = balance[id] + amount;

	}

	public static void exit(int id) {

		main(null);

	}

	public static void menuDisplay() {
		System.out.printf("%nMain menu%n");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");

	}

}
