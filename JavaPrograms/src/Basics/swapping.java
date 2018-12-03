package Basics;

public class swapping {

	public static void main(String[] args) 
	{
		
           int a = 5;
           int b = 4;
           
           a=a^b;
           b=a^b;
           a=a^b;
           System.out.println("a value is"+a);
           System.out.println("b value is"+b);
	}

}
