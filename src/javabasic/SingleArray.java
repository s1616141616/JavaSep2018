package javabasic;
public class SingleArray {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 100;
		arr[3] = 1000;
		arr[4] = 10000;

		for (int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);

	}
}