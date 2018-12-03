package sorting_algorithms;

public class InsertionSorting 
{

	public static void main(String[] args) 
	{
		int a[] = {5,6,9,2,1};
		int n = a.length;
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int key=a[i];
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			    a[j+1]=key;			
	    }
		for(int i=0;i<n;i++)
	    {
	 	   System.out.println(a[i]+"");
        }	
     }
		

}

