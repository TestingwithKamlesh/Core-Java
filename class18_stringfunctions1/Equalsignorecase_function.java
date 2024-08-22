package class18_stringfunctions1;

//This program uses "equalsIgnoreCase" string function to compare two string and gives output in form of boolean i.e true or false

import java.util.Scanner;

public class Equalsignorecase_function {
	
	Scanner Input = new Scanner(System.in);
	
	static String Pass1, Pass2;
	
	public void User1Input()
	{
		System.out.println("User 1 enter your sentence");
		Pass1=Input.nextLine();
	}
	
	public void User2Input()
	{
		System.out.println("user 2 enter your sentence");
		Pass2=Input.nextLine();
	}
	
	public static void main(String[] args)
	{
		Equalsignorecase_function pass = new Equalsignorecase_function();
		pass.User1Input();
		pass.User2Input();
		boolean result= Pass1.equalsIgnoreCase(Pass2);
		
		if (result==true)
		{
			System.out.println("both of your sentences are same");
		}
		else
		{
			System.out.println("both of your sentences are different");
		}
	}
}
