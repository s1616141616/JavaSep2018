package HashMap;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Tom");
		hm.put(2, "Dick");
		hm.put(3, "Harry");

		System.out.println("Now Printing HashMap values...");
		System.out.println(hm);
		System.out.println("Diffrent way of printing......");

		for (Integer key : hm.keySet())
			System.out.println(key + " : " + hm.get(key));

		System.out.println("Size of the Map is " + hm.size());

		hm.remove(2);

		System.out.println("After removing 1 value....");

		for (Integer key : hm.keySet())
			System.out.println(key + " : " + hm.get(key));

		hm.put(2, "Mohammad");

		System.out.println("After adding 1 value....");

		for (Integer key : hm.keySet())
			System.out.println(key + " : " + hm.get(key));
	}
}