package javabasic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				scan.close();
		System.out.println("Enter a Month Name..");

		String choice = scan.nextLine();

		switch (choice) {

		case "January":
		case "january":
			System.out.println("you entered January!");
			break;

		case "February":
			System.out.println("you entered February!");
			break;

		case "March":
			System.out.println("you entered March!");
			break;

		case "April":
			System.out.println("you entered April!");
			break;

		case "May":
			System.out.println("you entered May!");
			break;

		case "June":
			System.out.println("you entered June!");
			break;

		case "July":
			System.out.println("you entered July!");
			break;

		case "August":
			System.out.println("you entered August!");
			break;

		case "September":
			System.out.println("you entered September!");
			break;

		case "October":
			System.out.println("you entered October!");
			break;

		case "November":
			System.out.println("you entered November!");
			break;

		case "December":
			System.out.println("you entered December!");
			break;

		default:
			System.out.println("Try again");
			break;
		}
	}
}