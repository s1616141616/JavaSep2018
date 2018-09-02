package javaPractice;

public class ArithmeticOperators {

	public static void main(String[] args) {

		add();
		add1();
		sub();
		multi();
		div();
		div1();
		mod();
	}

	public static void add() {
		int x, y, ans;
		x = 2;
		y = 3;
		ans = x + y;
		System.out.println("Result after adding two numbers is " + ans);
	}

	// different ways of variable declaration

	public static void add1() {

		int x = 2, y = 3, ans;

		ans = x + y;

		System.out.println("Result after adding two numbers is " + ans);
	}

	public static void sub() {

		int x = 2, y = 3, ans;

		ans = x - y;

		System.out.println("Result after substracting two numbers is " + ans);
	}

	public static void multi() {

		int x = 2, y = 3, ans;

		ans = x * y;

		System.out.println("Result after multiplying two numbers is " + ans);
	}

	public static void div() {

		int x = 2, y = 3, ans;

		ans = x / y;

		System.out.println("Result after dividing two numbers is " + ans);
	}

	public static void div1() {

		double x = 2, y = 3, ans; // or float type

		ans = x / y;

		System.out.println("Result after dividing two numbers is " + ans);
	}
	// to print Reminder value

	public static void mod() {

		int x = 7, y = 3, ans;

		ans = x % y;

		System.out.println("Remainder after dividing two numbers is " + ans);
	}
}