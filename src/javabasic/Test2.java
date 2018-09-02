package javabasic;

public class Test2 {

	public static void main(String[] args) {

		Test2 obj = new Test2();

		try {
			obj.add(10, 20);
			System.out.println("Method add called");

			obj.div(20, 0);
			System.out.println("Method div called");
		} catch (Exception e) {
			System.out.println("Exception occured!!!");
		}
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}
}