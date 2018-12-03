package Basics;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		String reverse="";	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String value:");
		String str = s.nextLine();
		int n = str.length();	
		for (int i = (n-1);i>=0;i--) 
		{
			
			reverse=reverse+str.charAt(i);
		}
	
        System.out.println(reverse);  
	}
                    //OR
	/*public static void main(String[] args) 
	{
		
          System.out.println("Enter String value:");
          Scanner sc = new Scanner(System.in);
          String str=sc.nextLine();
          
          StringBuilder sb= new StringBuilder(str);
          System.out.println("Reversed string is:");
          System.out.println(sb.reverse().toString());
	}*/
	                //OR
	/*public static void reverse() {
		String str = "I use selenium webdriver. selenium is a tool for web applications.";
		int n = str.length();
		StringBuffer strb = new StringBuffer();
		for( int i=n-1; i>=0; i--){
		strb = strb.append(str.charAt(i));
		}
		System.out.println(strb);
		}*/
}
