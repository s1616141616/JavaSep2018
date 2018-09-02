package HashMap;

import java.util.HashMap;

public class KeySetForEach {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Tom");
		hm.put(2, "Dick");
		hm.put(3, "Harry");

		for (Integer print : hm.keySet())
			System.out.println(print + " :" + hm.get(print));
	}
}