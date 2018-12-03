package patterns;

public class Rectangle_stars {

	public static void rectangleStars(int n)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int n = 5;
		rectangleStars(n);

	}

}
