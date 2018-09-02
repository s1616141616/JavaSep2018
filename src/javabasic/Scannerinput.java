package javabasic;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.close();
		System.out.println("Please enter your name.");
		//for integer value
		//int input =scan.nextInt();
		String input = scan.next();

		System.out.println("Welcome to the world of IT Mr. " + input + ".");
	}
}