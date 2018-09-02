package javabasic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		/*
		 * HashSet doesn't allow duplicate elements. But List Does
		 */

		HashSet<String> mySet = new HashSet<String>();

		mySet.add("Tom");
		mySet.add("Dick");
		mySet.add("Harry");

		Iterator<String> itr = mySet.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("...................");
		System.out.println("Integer Values......");
		System.out.println("...................");
		
		HashSet<Integer> mySet1 = new HashSet<Integer>();

		mySet1.add(50);
		mySet1.add(500);
		mySet1.add(5000);

		Iterator<Integer> itr1 = mySet1.iterator();

		while (itr1.hasNext())
			System.out.println(itr1.next());
	}
}