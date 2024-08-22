package class19_stringsfunctions2;

import java.util.Scanner;

public class Find_palindrome 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your String");
		String str1 = s1.next();
		String str2 = "";
		s1.close();
		
		for(int i=str1.length()-1; i>=0; i--)
		{
			str2 = str2+str1.charAt(i);
		}
		System.out.println("reverse of your string is :" +str2);
		
		/*if(str2==str1) //comparison operator will only work if both the object pointing to the same reference 
		{
			System.out.println("Your string "+ str1 +"is a palindrome");
		}*/
		if(str1.equals(str2))
		{
			System.out.println("Your string "+(str1)+" is a palindrome");
		}
		else
		{
			System.out.println("Your string is not a palindrome");
		}
	}
}
