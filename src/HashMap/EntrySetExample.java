package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {
public static void main(String[] args) {
	
	Map<Integer, String> m = new HashMap<Integer, String>();

	m.put(1, "Tom");
	m.put(2, "Dick");
	m.put(3, "Harry");

	Set <Map.Entry<Integer, String>> entrySet = m.entrySet();
	
	for (Entry<Integer, String> entry:entrySet) {
		System.out.println("Key is " + entry.getKey() + " and value is " +entry.getValue() );
		//System.out.println(entry.getValue());
	}
	
}
}
