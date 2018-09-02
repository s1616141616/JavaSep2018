package javabasic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator2 {

	static int input;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		userInput();
		answer();
		defineRange();
	}

	public static void userInput() {

		System.out.println("How many digit your random number should be?");
		input = scan.nextInt();
	}

	public static void answer() {

		if (input == 2) {
			int nDigit = Digit(10, 99);
			System.out.println((double) nDigit);
		} else if (input == 3) {
			int nDigit = Digit(100, 999);
			System.out.println((float) nDigit);
		} else if (input == 4) {
			int nDigit = Digit(1000, 9999);
			System.out.println(nDigit);
		} else {
			System.out.println("Invalid ! Try Again ? Press 1 or press any key to terminate !!!");

			input = scan.nextInt();
			if (input == 1) {
				userInput();
				answer();

			} else {
				System.out.println("Thanks.");
			}
		}
	}

	public static void defineRange() {

		if (input == 2) {
			System.out.println("Press 1 if your number between 10-15 else press 2 !!!");

			input = scan.nextInt();
			if (input == 1) {
				System.out.println("Press 1 if your number less than 13 else press 2!!!");

				input = scan.nextInt();
				if (input == 1) {
					System.out.println("Press 1 if your number is even else press 2");

					input = scan.nextInt();
					if (input == 1) {
						System.out.println("your number is 11");
					}
				}
			} else if (input == 2) {
				System.out.println("Press 1 if your number less than 18 else press 2!!!");

				input = scan.nextInt();
				if (input == 1) {
					System.out.println("Press 1 if your number is even else press 2");

					input = scan.nextInt();
					if (input == 1) {
						System.out.println("your number is 16");

					} else if (input == 2) {
						System.out.println("19");
					}
				}
			}
		}
	}

	public static int Digit(int start, int finish) {
		return (new Random().nextInt(finish + 1 - start) + start);
	}
}