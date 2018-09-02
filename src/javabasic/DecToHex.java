package javabasic;

import java.util.Scanner;

//Prog12=Java Program to convert decimal to hexadecimal.
/*

Prog15=Java Program to Convert Decimal to Octal*/

public class DecToHex {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a decimal number to convert.");
		int input = scnr.nextInt();
		scnr.close();
		String hex = Integer.toHexString(input);

		System.out.println(hex.toUpperCase());

		// Prog13=Java Program to Convert Decimal to Binary
		int i = 20;
		String Binary = Integer.toBinaryString(i);
		System.out.println(Binary);

		// Prog14=Java Program to convert binary to Decimal.
	}
}