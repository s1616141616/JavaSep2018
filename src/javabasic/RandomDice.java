package javabasic;

import java.util.Random;

public class RandomDice {

	public static void main(String[] args) {

		Random dice = new Random();
		int num = 0;

		for (int counter = 1; counter <= 6; counter++)

		{
			num = dice.nextInt(5) + 1;
			System.out.println(num);
		}
	}
}