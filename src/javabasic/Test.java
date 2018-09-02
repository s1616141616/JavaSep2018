package javabasic;

import java.util.HashSet;
import java.util.Random;

public class Test {

	static Random rnd = new Random();

	public static void main(String[] args) {

		System.out.println("Generating Random numbers.....");
		generateRandom();

		System.out.println(".........................................................................");
		System.out.println("Generating unique random numbers....");
		generateUniqueRandom();

		System.out.println(".........................................................................");
		System.out.println("Now Retrieving Student details...");
		studentData();

		System.out.println(".........................................................................");
		System.out.println("Now working with constructor...");
		getConstructorValue();

		System.out.println(".........................................................................");
		System.out.println("Method Overloading...");
		System.out.println(methodOverloading(5, 5));
		System.out.println(methodOverloading(5.0, 5.0));
		System.out.println(methodOverloading("Mohammad ", "Saif"));
	}

	public static void generateRandom() {
		for (int i = 0; i < 5; i++)
			System.out.println(rnd.nextInt(5));
	}

	public static void generateUniqueRandom() {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 5; i++) {
			int random = rnd.nextInt(9) + 1;
			set.add(random);
		}
		for (int genUnique : set) {
			System.out.println(genUnique);

		}

	}

	public static void studentData() {

		Student student = new Student();

		student.setSID(007);
		student.setName("James Bond");
		student.setAge(29);

		System.out.println("Student ID " + student.getSID() + ", His Name is " + student.getName() + " & His Age is "
				+ student.getAge());

		student.setSID(420);
		student.setName("Gabbar Singh");
		student.setAge(49);

		System.out.println("Student ID " + student.getSID() + ", His Name is " + student.getName() + " & His Age is "
				+ student.getAge());

	}

	public static void getConstructorValue() {

		Const con = new Const();
		System.out.println(con.getRectangle());

		Const con1 = new Const(100, 150, 250);
		System.out.println(con1.getRectangle());

	}

	public static int methodOverloading(int a, int b) {

		return (a + b);
	}

	public static double methodOverloading(double a, double b) {

		return (a * b);
	}

	public static String methodOverloading(String a, String b) {

		return (a + b);
	}
}