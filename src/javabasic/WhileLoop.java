package javabasic;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("Now reversing the value");

		int j = 10;
		while (j >= 0) {
			System.out.println(j);
			j--;
		}
	}
}