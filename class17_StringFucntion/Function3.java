package class17_StringFucntion;

import java.util.Scanner;

public class Function3 {
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println(" Enter name of first person: ");
		String name1 = s1.nextLine();
		System.out.println(" Enter name of second person: ");
		String name2 = s1.nextLine();
		
		for(int i=0; i<name1.length(); i++)
		{
			char c = name1.charAt(i);
			System.out.println(c);
		}	
	s1.close();
	}
}
