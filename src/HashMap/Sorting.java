package HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(5, "Tom");
		m.put(2, "Dick");
		m.put(9, "Harry");
		m.put(12, "Nafisa");
		m.put(1, "Samiyah");

		List<Entry<Integer, String>> l = new LinkedList<Entry<Integer, String>>(m.entrySet());

		Collections.sort(l, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		for (Entry<Integer, String> item : l)
			System.out.println(item);

		System.out.println("Printed by sorted value");
		System.out.println("...........................");

		Collections.sort(l, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}

		});
		System.out.println("Now printing by sorting key....");
		for (Entry<Integer, String> item : l)
			System.out.println(item);

	}
}