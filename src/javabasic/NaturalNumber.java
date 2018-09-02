package javabasic;

import java.util.Scanner;

//Prog6=Java Program to Find Sum of Natural Numbers.

public class NaturalNumber {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		int i = 1;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your choice.");
		num = scnr.nextInt();
		scnr.close();

		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("Some of your number is: " + sum);
	}
}