package Basics;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value"); 
		n=sc.nextInt();
		/*for(int i=1;i>=0;i++)
		{*/
			if(n%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("Odd number");
			}
		//}

	}

}
