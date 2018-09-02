package test;

public class PowerBall
{
	public static void main(String[] args)
	{
		int random;
		for (int i =0; i<5;i++)
		{
		random=(int)(Math.random()*69);
		System.out.println(random);
		}
		System.out.println("Power Ball number is:");
		
		for (int j=0;j<1;j++){
			random =(int)(Math.random()*26);
			System.out.println(random);
		}
	}
}