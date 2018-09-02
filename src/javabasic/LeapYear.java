package javabasic;

import java.util.Scanner;

//Prog8=Java Program to check Leap Year.

public class LeapYear {

	public static void main(String[] args) {

		boolean leap = false;

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a year to check..");
		int year = scnr.nextInt();
		scnr.close();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}