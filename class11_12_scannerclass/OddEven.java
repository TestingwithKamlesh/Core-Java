package class11_12_scannerclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check even or odd");
		
		try 
		{
			int num = input.nextInt();
			if(num%2==0)
			{
				System.out.println("The number is even");
			}
			else
			{
				System.out.println("The number is odd");
			}
		}
		
		catch(InputMismatchException Error)
			{
				System.out.println("You have entered a decimal value");
			}
		input.close();
	}

}
