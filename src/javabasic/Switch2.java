package javabasic;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				scan.close();

		System.out.println("Enter a number..");
		int num1 = scan.nextInt();

		System.out.println("Enter another number..");
		int num2 = scan.nextInt();

		System.out.println("Type 1 for Addition");
		System.out.println("Type 2 for Subtraction");
		System.out.println("Type 3 for Multiplication");
		System.out.println("Type 4 for Division");

		int choice = scan.nextInt();
		switch (choice) {

		case 1:

			int add = (num1 + num2);
			System.out.println("Answer is: " + add);

			break;

		case 2:
			int sub = (num1 - num2);
			System.out.println("Answer is: " + sub);

			break;
		
		case 3:
			int multi = (num1 * num2);
			System.out.println("Answer is: " + multi);

			break;
		
		case 4:
			int div = (num1 / num2);
			System.out.println("Answer is: " + div);

			break;

		default:
			System.out.println("Try again");
		 
			break;
		}
	}
}