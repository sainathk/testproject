package programs;

public class leapYear 
{

	public static void main(String[] args)
	{
		int year = 2012;
		if(year%4==0 || year%100==0 || year%400==0)
		{
			System.out.println(year+"is Leap year");
		}
		else
		{
			System.out.println(year+"is not a Leap year");
		}

	}

}
