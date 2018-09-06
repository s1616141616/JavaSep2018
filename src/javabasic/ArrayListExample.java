package javabasic;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		// ArryList can contain duplicate elements. But HashSet doesn't.
		myList.add(56);
		myList.add(56);
		myList.add(56);
		myList.add(56);
		myList.add(420);
		myList.add(56);
		myList.add(56);

		System.out.println(myList);
		for (Integer i : myList)
			System.out.println(i);

		System.out.println("My List Size is " + myList.size());

		myList.remove(4);

		myList.set(1, 100);
		myList.set(2, 200);
		myList.set(3, 300);
		myList.set(4, 400);
		myList.set(5, 500);
		System.out.println("After Updating values in list.");
		for (Integer i : myList)
			System.out.println(i);

		System.out.println("After removing 1 number list size is  " + myList.size());

		myList.clear();

		for (Integer i : myList)
			System.out.println(i);

		System.out.println("After clearing all values list size is " + myList.size());
	}
}