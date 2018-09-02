package javabasic;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		boolean prime = true;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a number...");
		int input = scnr.nextInt();
		
		for (int i = 2; i < input; i++)
			if (input % i == 0) {
				prime = false;
				break;
			}
		if (prime == true) {
			System.out.println("Prime");
		} else {
			System.out.println("False");
		}
	}
}