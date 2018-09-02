package javabasic;

public class MegaMillion {
	public static void main(String[] args)
	{
		int random;
		for (int i =0; i<5;i++)
		{
		random=(int)(Math.random()*75);
		System.out.println(random);
		}
		System.out.println("Mega number is:");
		
		for (int j=0;j<1;j++){
			random =(int)(Math.random()*15);
			System.out.println(random);
		}
	}
}