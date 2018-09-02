package javabasic;

import java.util.Scanner;

/*Write a Calc program that will have four operations add(), sub(), mul(), div()
only on Integer.*/

public class Calculator {

	public static void main(String[] args) {
		
		int a;
		int b;
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number whole number..");
		a=input.nextInt();
		System.out.println("enter another whole number ..");
		b=input.nextInt();
		System.out.println("for addition press 1.");
		System.out.println("for subtraction press 2.");
		System.out.println("for multiplication press 3.");
		System.out.println("for subtraction press4.");
		choice =input.nextInt();
		input.close();
		switch (choice) {
		
		case 1:
			add (a,b);
			break;
		case 2:
			sub (a,b);
			break;
		case 3:
			multi (a,b);
			break;
		case 4:
			div (a,b);
			break;
		default:
			System.out.println("Invalid choice!!!");
			break;
			}
	}
	
	static void add (int a, int b) {
		int c =a+b;
		System.out.println(c);
	}
	
	static void sub (int a, int b) {
		int c =a-b;
		System.out.println(c);
	}
	
	static void multi (int a, int b) {
		int c =a*b;
		System.out.println(c);
	}
	
	static void div (int a, int b) {
		int c =a/b;
		System.out.println(c);
	}
}