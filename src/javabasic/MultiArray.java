package javabasic;

public class MultiArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 10;
		arr[1][0] = 100;
		arr[1][1] = 1000;
		arr[1][2] = 10000;

		for (int i = 0; i <= arr.length; i++)
			for (int j=0; j<=arr.length;j++)
			System.out.println(arr[i][j]);

	}
}