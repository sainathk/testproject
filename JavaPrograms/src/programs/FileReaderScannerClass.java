package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderScannerClass 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream file = new FileInputStream("E:\\Practise Java\\Basics\\Add.java");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
   
	}

}
