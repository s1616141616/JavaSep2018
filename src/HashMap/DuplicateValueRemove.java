package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class DuplicateValueRemove {

	public static void main(String a[]) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "2");
		map.put("D", "3");
		map.put("E", "3");

		Collection<Object> list = map.values();
		for (Iterator<Object> itr = list.iterator(); itr.hasNext();) {
			if (Collections.frequency(list, itr.next()) > 1) {
				itr.remove();
			}
		}

		System.out.println(map);

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(134, "RAM");
		ht.put(235, "John");
		ht.put(876, "Crish");
		ht.put(512, "Tom");

		System.out.println("Adding duplicate entry:");
		ht.put(512, "Tom");

		Set<Integer> keys = ht.keySet();
		for (Integer key : keys) {
			System.out.println(key + " ==> " + ht.get(key));
		}

		System.out.println("Duplicate got eliminated!!!");

	}

}