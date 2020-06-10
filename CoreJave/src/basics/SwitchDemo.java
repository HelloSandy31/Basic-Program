package basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for One ,2 fro Two and 3 For Three");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Invalid choice");
		}

	}
}
