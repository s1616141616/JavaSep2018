package javaPractice;

public class MethodPerameter {

	public static void main(String[] args) {

		saySomething("Harun");
		saySomething("Nafisa");

		add(10, 20);
		add(20, 30);

		int result = multi(10, 20);
		System.out.println("After multiplication " + result);
		System.out.println("After multiplication " + result * 10);
	}

	public static void saySomething(String name) {
		System.out.println("My name is " + name);
	}

	public static void add(int x, int y) {
		System.out.println(x + y + " after adding ");
	}

	public static int multi(int x, int y) {
		return x * y;
	}
}