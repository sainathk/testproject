package Collections;

import java.util.ArrayList;

public class array_list 
{

	public static void main(String[] args) 
	{
		int n = 5;
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		for(int i=1;i<=n;i++)
		{
			al.add(i);
			System.out.println(al);			
		}
		al.remove(3);
		System.out.println(al);
	}

}
