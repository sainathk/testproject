package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader 
{

	public static void main(String[] args) throws IOException 
	{
		File fi = new File("E:\\Practise Java\\Basics\\Add.java");
		BufferedReader bf = new BufferedReader(new FileReader(fi));
		String str;
		while ((str= bf.readLine())!=null)
		{
			System.out.println(str);
		}
		

	}

}
