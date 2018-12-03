package Basics;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int n = 121,r,sum=0,temp=n;
		while(n>0)
		{
			r = n%10;     // r=121%10 --> 1     //if r=1,n=12,sum=1    r=12%10    -->2    //if r=2,n=1,sum=12   r=1%10  --> 1
			n = n/10;     // n=121/10 --> 12                           n=12/10    -->1                          n=1/10  --> 0 
			sum=sum*10+r;   //sum = 0*10+1 -->1                        sum=1*10+2 -->12                         sum=12*10+1 --> 121
		}
		if(temp==sum)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}

	}

}
