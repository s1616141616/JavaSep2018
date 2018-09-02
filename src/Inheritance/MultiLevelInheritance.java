package Inheritance;

public class MultiLevelInheritance {
	public static void main(String[] args) {

		Dog1 dg = new Dog1();
		dg.bark();
		dg.bite();
		dg.run();
		dg.jump();
		System.out.println("....................");

		//Polymorphism
		
		Animal1 harun[] = new Animal1[2];
		harun[0] = new Horse1();
		harun[1] = new Dog1();
		
		for (int i=0;i<2;i++) {
			harun[i].eat();
		}
		
	}
}

class Animal1 {

	void eat() {
		System.out.println("This animal Eat.");
	}

	void bark() {
		System.out.println("This animal Bark.");
	}
}

class Horse1 extends Animal1 {
	void run() {
		System.out.println("This animal run!!!");
	}
}

class Dog1 extends Horse1 {

	void bite() {
		System.out.println("THis animal bites.");
	}

	void jump() {
		System.out.println("This animal jumps.");
	}
}