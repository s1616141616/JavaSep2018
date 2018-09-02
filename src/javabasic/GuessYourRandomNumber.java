package javabasic;

import java.util.Scanner;

public class GuessYourRandomNumber {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int rnd = 0;
		int guessedNumber;
		int guerssCounter = 0;
		int maxGuess = 10;

		System.out.println("How many digits random number you want to generate?");
		rnd = scan.nextInt();

		int a = (int) Math.pow(10, rnd);
		int generatedRandom = (int) (Math.random() * a);

		boolean userGuess = false;

		while (!userGuess) {

			System.out.println("Enter your number to match.");
			guessedNumber = scan.nextInt();

			if (guessedNumber > generatedRandom) {
				System.out.println("Higher than actual number");
				System.out.println(
						"Your attempt number is " + (guerssCounter = guerssCounter + 1) + " out of " + maxGuess);

				if (guerssCounter == maxGuess) {
					System.out.println("No More Attempt Left :(");
					break;
				}

			} else if (guessedNumber < generatedRandom) {
				System.out.println("Lower than actual number.");
				System.out.println(
						"Your attempt number is " + (guerssCounter = guerssCounter + 1) + " out of " + maxGuess);

				if (guerssCounter == maxGuess) {
					System.out.println("No More Attempt Left :(");
					break;
				}

			} else if (guessedNumber == generatedRandom) {
				System.out.println("Bingo !!! You WON ");
				System.out.println(
						"Your attempt number is " + (guerssCounter = guerssCounter + 1) + " out of " + maxGuess);
				break;
			}
		}
	}
}