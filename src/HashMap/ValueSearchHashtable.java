package HashMap;

import java.util.Hashtable;

public class ValueSearchHashtable {

	public static void main(String a[]) {
		Hashtable<String, String> hm = new Hashtable<String, String>();
		// add key-value pair to Hashtable
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		if (hm.containsValue("SECOND INSERTED")) {
			System.out.println("The Hashtable contains value SECOND INSERTED");
		} else {
			System.out.println("The Hashtable does not contains value SECOND INSERTED");
		}
		if (hm.containsValue("first")) {
			System.out.println("The Hashtable contains value first");
		} else {
			System.out.println("The Hashtable does not contains value first");
		}
	}
}