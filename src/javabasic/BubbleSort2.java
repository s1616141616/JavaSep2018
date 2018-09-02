package javabasic;

public class BubbleSort2 {
	public static void main(String[] args) {

		int arr[] = { 5, 7, 2, 4, 3, 1, 6 };

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++)
				if (arr[i] > arr[j]) {
					// swap temp and arr[i]
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					for (int k : arr)
						System.out.println(k);
				}
	}
}