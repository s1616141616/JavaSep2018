package javabasic;

public class OccurrrenceString {

	public static void main(String[] args) {

		String str = "I Love Bangladesh but";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(str.length());
		System.out.println(str.indexOf("B"));
		System.out.println(str.replace("I", "We"));
		System.out.println(str.replace("Bangladesh", "Thailand"));
		System.out.println(str);
	}
}