package patterns;

public class LeftPyramid 
{
	public static void leftPyramid(int n)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");

			}
			System.out.println();	
		}
		
	}
	public static void main(String[] args) 
	{
		
		int n = 5;
		leftPyramid(n);

	}

}
