package Inheritance;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Monkey mnk = new Monkey();
		Fox fx = new Fox();

		mnk.eat();
		mnk.jump();
		fx.run();
		fx.bark();
		fx.eat();
	}
}

class Animal11 {

	void eat() {
		System.out.println("This animal Eat.");
	}

	void bark() {
		System.out.println("This animal Bark.");
	}
}

class Monkey extends Animal11 {

	void jump() {
		System.out.println("This animal jumps");
	}
}

class Fox extends Animal11 {

	void run() {
		System.out.println("This Animal run.");
	}
}