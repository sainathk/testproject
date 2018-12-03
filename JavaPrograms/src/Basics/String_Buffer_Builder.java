package Basics;

public class String_Buffer_Builder 
{
   
	public static void concat1(String s1)
	{
		s1=s1+"forgeeks";
	}
	public static void concat2(StringBuilder s2)
	{
		s2.append("forgeeks");
	}
	public static void concat3(StringBuffer s3)  //String Buffer: it is a thread safe and accessed from multiple threads and also immutable.
	{
		s3.append("forgeeks");
	}
	
	public static void main(String[] args) 
	{
	          String s1="Geeks";
	          concat1(s1); //s1 is not changed
	          System.out.println("String"+s1);
	          
	          StringBuilder s2 = new StringBuilder("Geeks");
	          concat2(s2);  //s2 is changed
	          System.out.println("StringBuilder"+"\t"+s2);
	          
	          StringBuffer s3 = new StringBuffer("Geeks");
	          concat3(s3);  //s3 is changed
	          System.out.println("StringBuffer"+"\t"+s3);
	             
	}

}
