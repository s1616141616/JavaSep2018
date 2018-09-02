package javabasic;

import java.util.Scanner;

//Prog1=Java Program to Check Even or Odd Number.

public class EvenOdd {

	public static void main(String[] args) {

		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check...");
		num = input.nextInt();
		input.close();
		if (num % 2 == 0) {
			System.out.println("Even!!!!");
		} else {
			System.out.println("Odd!!!!");
		}
	}
}