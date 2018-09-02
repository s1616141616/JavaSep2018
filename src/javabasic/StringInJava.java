package javabasic;

public class StringInJava {

	public static void main(String[] args) {

		String myString = "I'm Harun!!!";
		// String myString ="I'm " +" Harun!!!";

		int myStringLength = myString.length();
		String myStringLower = myString.toLowerCase();
		String myStringUpper = myString.toUpperCase();

		System.out.println(myStringLength);
		System.out.println(myStringLower);
		System.out.println(myStringUpper);
		System.out.println(myString.replace('H', 'D')); // Case Sensitive!
		System.out.println(myString.indexOf('H'));
	}
}