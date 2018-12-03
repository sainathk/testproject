
package Basics;
public class Prime1
{
  public static void main(String[] arge)
  
  {
   int number = 7; //This is the value to be check
   int temp = 0;
   for(int i=2;i<=number-1;i++)
    {
     if(number%i==0)
      {
       temp=temp+1;
      }
    }
     if(temp==0)
      {
       System.out.println("Number is Prime");
      }
     else
     {
    	 System.out.println("Number is not prime");
     }
   }
}