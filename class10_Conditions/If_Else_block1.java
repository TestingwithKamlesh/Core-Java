package class10_Conditions;
import java.util.Scanner;
public class If_Else_block1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 1 for Male");
		System.out.println("Please enter 2 for Female");
		Byte Gender=input.nextByte();
		
		if(Gender==1)
		{
			System.out.println("Please enter your age");
			byte age = input.nextByte();
			if (age <=12)
			{
				System.out.println("Half ticket is applicable");	
			}
			else if (age>12 && age<=59)
			{
				System.out.println("Full tickt is applicable");
			}
			else
			{
				System.out.println("Senior citizen ticket is applicable");
			}
		}
		else if (Gender==2)
		{
			System.out.println("Travelling is free");
		}
		else
		{
			System.out.println("Please provide a valid input");
		}		
	input.close();	
	}
}
