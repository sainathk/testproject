package Basics;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		int n,a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println("Fibonacci value:"+a);
		}
	}
}

/*1 2
int f1=1,f2=2,f3,n; 
for(int i=1;i<=n;i++)
f3=f1+f2;
f1=f2;
f2=f3;*/

