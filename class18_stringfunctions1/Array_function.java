package class18_stringfunctions1;

import java.util.Arrays;

public class Array_function {

	public static void main(String[] args) 
	{
		int roll[] = new int[4];
		roll[0] = 111790;
		roll[1] = 111791;
		roll[2] = 111792;
		roll[3] = 111793;
		
		//Arrays.toSring() function will print the array list in string format.
		System.out.println(Arrays.toString(roll));
		
		for(int i=0; i<roll.length; i++)
		{
			System.out.println(roll[i]);
		}
	}
}
