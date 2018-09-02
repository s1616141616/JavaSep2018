package HashMap;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class HashtableExample {
	public static void main(String[] args) {

		Hashtable<Integer, String> tblCity = new Hashtable<Integer, String>();

		tblCity.put(1, "Dhaka");
		tblCity.put(2, "Bangkok");
		tblCity.put(3, "Los Angeles");

		System.out.println("Now printing City...");

		for (Integer print : tblCity.keySet())
			System.out.println(print + " : " + tblCity.get(print));

		Hashtable<Integer, String> tblCountry = new Hashtable<Integer, String>();

		tblCountry.put(1, "Bangladesh");
		tblCountry.put(2, "Thailand");
		tblCountry.put(3, "USA");

		System.out.println("Now printing Country...");
		for (Integer print1 : tblCountry.keySet())
			System.out.println(print1 + " : " + tblCountry.get(print1));

		Hashtable<String, Hashtable<Integer, String>> tblName = new Hashtable<String, Hashtable<Integer, String>>();

		tblName.put("City", tblCity);
		tblName.put("Country", tblCountry);

		System.out.println(".......................");
		Set<String> keys = tblName.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is: " + tblName.get(key));
			}
			// Different way
			/*
			 * Enumeration<String> keyss = tblName.keys(); while (keyss.hasMoreElements()) {
			 * String key1 = keyss.nextElement(); System.out.println("Value of " + key1 +
			 * " is: " + tblName.get(key1)); }
			 */
		System.out.println(".......................");
		System.out.println("Capital of " + 
				tblName.get("Country").get(1) + " is " + tblName.get("City").get(1) + ".");
		System.out.println("Capital of " +
				tblName.get("Country").get(2) + " is " + tblName.get("City").get(2) + ".");
		System.out.println("Capital of " +
				tblName.get("Country").get(3) + " is " + tblName.get("City").get(3) + ".");
			
	}
}