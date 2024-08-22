package class20_Arrays;

import java.util.Arrays;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		String input = "pooja";
		//int input = 789456123; int dataype cannot be used with tocharArray as it is non primitive datatype
		char []c1 = input.toCharArray(); //toCharArray converts a string into array.
		System.out.println(Arrays.toString(c1));
	}
}

