package javaPractice;

public class ConditionalOperator {

	public static void main(String[] args) {

		logicalAnd();
		logicalOr();
		logicalAndOr();
		logicalAndAnd();
	}

	public static void logicalAnd() {

		String city = "Dhaka";
		String country = "USA";

		if ((city == "Dhaka") && (country == "Bangladesh")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void logicalOr() {

		String city = "Dhaka";
		String country = "USA";

		if ((city == "Dhaka") || (country == "Bangladesh")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void logicalAndOr() {

		String city = "Dhaka";
		String country = "USA";

		if ((city == "Dhaka") && (country == "Bangladesh") || (country == "USA")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static void logicalAndAnd() {

		String city = "Dhaka";
		String country = "USA";
		String currency = "BDT";

		if ((city == "Dhaka") && (country == "Bangladesh") && (currency == "USD")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}