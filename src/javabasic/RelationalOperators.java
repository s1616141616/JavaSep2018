/**
 * 
 */
package javabasic;

/**
 * @author Saif
 * 	is equal to 				==
 * 	is not equal to 			!=
 * 	is greater than 			>
 * 	is less than				<
 * 	is greater than or equal to >=
 * 	is less than or equal to	<=
 */

public class RelationalOperators {

	public static void main(String[] args) {

		equalTo();
		notEqualTo();
		greaterThan();
		lessThan();
		greaterThanEqualTo();
		lessThanEqualTo();
	}

	public static void equalTo() {

		int x = 25;

		if (x == 25) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void notEqualTo() {

		int x = 25;

		if (x != 25) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void greaterThan() {

		int x = 25;

		if (x > 20) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void lessThan() {

		int x = 25;

		if (x < 25) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void greaterThanEqualTo() {

		int x = 25;

		if (x >= 25) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void lessThanEqualTo() {

		int x = 25;

		if (x >= 27) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}