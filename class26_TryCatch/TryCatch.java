package class26_TryCatch;
import java.util.Arrays;
import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
	
	int number[] = new int[4];
	
	try 
	{
		for(int i =0;i<=number.length; i++)
		{
			System.out.println("Please enter value");
			number[i] = s1.nextInt(); 
		}
	}
	catch(ArrayIndexOutOfBoundsException r1)
	{
		System.out.println("Please enter only 4 values");
	}
	System.out.println("Your Array value is :"+Arrays.toString(number));
	s1.close();
	}

	
}
