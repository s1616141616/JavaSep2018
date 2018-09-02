package javabasic;

import java.util.Scanner;

public class TryCatchExample {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		int i = 1;

		do {
			try {
				System.out.println("enter a number");
				int num1 = scan.nextInt();

				System.out.println("enter another number");
				int num2 = scan.nextInt();

				int ans = num1 / num2;
				System.out.println(ans);

				i = 2;
				}
			catch (Exception e) // Any Exception
				{
				System.out.println("Bad try !!! Do it again....");
				}
		} while (i == 1);
	}
}