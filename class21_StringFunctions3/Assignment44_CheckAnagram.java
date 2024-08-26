package class21_StringFunctions3;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter text1: ");
		String input1 = s1.next();
		System.out.println("Please enter text2: ");
		String input2 = s1.next();
		
			if (input1.length()==input2.length())
			{
				char inp1[] = input1.toCharArray();
				char inp2[] = input2.toCharArray();
				Arrays.sort(inp1);
				Arrays.sort(inp2);
				
				String new_inp1 = Arrays.toString(inp1);
				String new_inp2 = Arrays.toString(inp2);
				
				boolean result = new_inp1.equalsIgnoreCase(new_inp2);
				
				if(result==true)
				{
					System.out.println("Given strings are Anagram");
				}
				else
				{
					System.out.println("Given strings are not Anagram");
				}	
			}
			else
			{
				System.out.println("Given strings are not Anagram");
			}
			s1.close();
	}
}
