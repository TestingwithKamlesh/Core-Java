package class18_stringfunctions1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArrayInput {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please provide the size of array");
		int size = s1.nextInt();
		
		String arr_str[] = new String[size];
		
		for(int i=0; i<arr_str.length; i++)
		{
			System.out.print("Please provide names of the employees");
			arr_str[i] = s1.next();
			System.out.println("Please provide next name: ");
		}
	
		System.out.println(Arrays.toString(arr_str));
		s1.close();
	}
}
