package javabasic;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberUnique {

	public static void main(String[] args) {

		Random rnd = new Random();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i < 6; i++)
			{
			int random = rnd.nextInt(99) + 1;
			set.add(random);

		}
		for (int randomNumbers : set) {
			System.out.println(randomNumbers);
		}
	}
}