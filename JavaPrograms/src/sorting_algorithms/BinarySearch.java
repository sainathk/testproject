package sorting_algorithms;

public class BinarySearch 
{
	int binarySearch(int a[],int x)
	{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int m =(start+end)/2;
			if(a[m]==x) 
			{
				return m;	
			}
			if(x<a[m])
			{
				end=m-1;
			}
			else
			{
			    start=m+1;	
			}		
		}
		return -1;
	}

	public static void main(String[] args) 
	{

        BinarySearch ob = new BinarySearch(); 
        int arr[] = {2, 3, 4, 10, 40}; 
        int n = arr.length; 
        int x = 10 ; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
        {
            System.out.println("Element not present"); 
        }
        else 
        {
            System.out.println("Element found at " +  "index " + result); 
        }
	}

}
