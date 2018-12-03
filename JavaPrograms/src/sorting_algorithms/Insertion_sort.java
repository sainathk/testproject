package sorting_algorithms;

public class Insertion_sort 
{

	public static void main(String[] args)
	{
		int[] myarray = {7,3,6,5,2};
		InsertionSort(myarray);
		printArray(myarray);
	}
    public static void InsertionSort(int arr[])
    {
    	int n = arr.length;
    	for(int i = 1;i<arr.length;i++)
    	{
    		int key = arr[i];
    		int j = i-1;
    		while(j>-1 && arr[j]>key)
    		{
    			arr[j+1]=arr[j];
    			j--; 			
    		}
    		arr[j+1]=key;
    	
    	}
    }
	public static void printArray(int array[]) 
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+"");
		}
		//System.out.println();
		
	}
}
