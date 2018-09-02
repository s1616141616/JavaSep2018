package javabasic;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(fact(5));
	}

	public static int fact(int N) {

		if (N <= 1)
			return 1;
		else {
			return (N * fact(N - 1));
		}
	}
}
