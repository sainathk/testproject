package patterns;

public class DownLeftPyramid 
{
    public static void rightPyramid(int n)
    {
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=5;j>=i;j--)
    		{		
    				System.out.print("* ");		
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) 
	{
		int n=5;
		rightPyramid(n);

	}

}
