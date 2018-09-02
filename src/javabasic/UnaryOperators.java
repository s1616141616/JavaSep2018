package javaPractice;

public class UnaryOperators {

	public static void main(String[] args) {

		postIncrement();
		preIncrement();
	}

	public static void postIncrement() {

		// post increment, print first then increment the value!

		int x = 10;
		System.out.println("Post Increment Example..........");
		System.out.println();
		System.out.println("Initial Value of variable is " + x++);
		System.out.println("After increment New value of x is " + x);
		System.out.println();
	}

	public static void preIncrement() {

		// pre-increment, increment first then print the value!

		int x = 10;
		System.out.println("Pre-Increment Example..........");
		System.out.println();
		System.out.println("After pre-increment Value of variable is " + ++x);
		System.out.println("New value of x is " + x);
		System.out.println();
	}
}