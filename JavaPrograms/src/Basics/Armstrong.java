package Basics;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int sum=0,n=153,r,temp=n;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			sum=sum+r*r*r;
		}
		if (temp==sum)
		{
			System.out.println("It is an Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}

	}

}
