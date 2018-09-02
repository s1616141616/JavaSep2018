package Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Horse hrs = new Horse();
		hrs.run();
		hrs.eat();
	}
}

class Animal {

	void eat() {
		System.out.println("This animal Eat.");
	}

	void bark() {
		System.out.println("Bark");
	}
}

class Horse extends Animal {
	void run() {
		System.out.println("Horse run!!!");
	}
}