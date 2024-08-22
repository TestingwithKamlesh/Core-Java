package class19_stringsfunctions2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputFromScanner 
{
	static Scanner s1 = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double []array1 = new double[5];
		System.out.println("Please provide 5 values for your array");
		
		for(int i=0; i<5; i++)
		{
			array1[i]= s1.nextDouble();
		}
		System.out.println("your array set of double datatype is: ");
		System.out.println(Arrays.toString(array1));
	}

}
