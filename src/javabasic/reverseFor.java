package javabasic;

public class reverseFor {

	public static void main(String[] args) {

		for (int i = 99; i >= 45; i = i - 9) {

			System.out.println(i);
				
		
		}
		System.out.println(" ");
		System.out.println("Reverse mood activated");	
		System.out.println("...........");
		
		int arr[] =new int[5];
		
			arr[0]=1;
			arr[1]=10;
			arr[2]=100;
			arr[3]=1000;
			arr[4]=10000;
		
			for (int j=arr.length -1;j>=0; j--)
			System.out.println(arr[j]);
	}
}