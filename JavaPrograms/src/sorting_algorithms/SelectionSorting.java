package sorting_algorithms;

public class SelectionSorting
{

	public static void main(String[] args) 
	{
		int a[] = {5,6,9,2,1};
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			int fixed=i;
			for(int v=i+1;v<n;v++)
			{
				if (a[fixed] > a[v])
				{
					fixed=v;
				}		
			}
			int temp = a[fixed];
			a[fixed]=a[i];
			a[i]=temp;
		}
       for(int i=0;i<n;i++)
       {
    	   System.out.println(a[i]+"");
       }
	}

}
