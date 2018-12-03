package programs;

public class VowelConsonants 
{

	public static void main(String[] args) 
	{
		String str ="Sainath";
		int vowels = 0;
		int consonants=0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
			
		}
		
	    System.out.println("Vowels in the string: "+"\n"+ vowels);
	    System.out.println("Consonants in the string: "+"\n"+consonants);
		
	}
	
}
