package javabasic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

	int input;
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		RandomNumberGenerator obj = new RandomNumberGenerator();
		obj.userInput();
		obj.answer();

	}

	public void userInput() {

		System.out.println("How many digit your random number should be?");
		input = scan.nextInt();
	}

	public void answer() {

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
			int input1 = scan.nextInt();
			if (input1 == 1) {
				userInput();
				answer();

			} else {
				System.out.println("Thanks.");
			}
		}
	}

	public static int Digit(int start, int finish) {
		return (new Random().nextInt(finish + 1 - start) + start);
	}
	
}