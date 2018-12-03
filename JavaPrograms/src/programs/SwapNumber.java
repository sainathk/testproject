package programs;

public class SwapNumber 
{

	public static void main(String[] args) 
	{
		float a = 2.1f;
		float b = 4.2f;
		System.out.println("Before swapping:");
		System.out.println(a);
		System.out.println(b);
		float temp = a;
		a = b;
		b=temp;
        System.out.println("After swapping:");
        System.out.println(a);
        System.out.println(b);
        
	}

}