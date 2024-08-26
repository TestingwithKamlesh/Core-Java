package class21_StringFunctions3;

import java.util.Arrays;

public class SplitFunction {

	public static void main(String[] args) 
	{
		String name = "Manish Kumar Tiwari";
		String[] new1 = name.split(" ", 3); //splits the string in size of 3 with Space as separator.
		System.out.println(Arrays.toString(new1));
	}
}
