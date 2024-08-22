package class18_stringfunctions1;

//This program uses "equals" string function to compare two string and gives output in form of boolean i.e true or false
import java.util.Scanner;

public class Equals_function {
	
	Scanner Input = new Scanner(System.in);
	
	static String Pass1, Pass2;
	
	public void User1Input()
	{
		System.out.println("User 1 enter your password");
		Pass1=Input.next();
	}
	
	public void User2Input()
	{
		System.out.println("user 2 enter your password");
		Pass2=Input.next();
	}
	
	public static void main(String[] args)
	{
		Equals_function pass = new Equals_function();
		pass.User1Input();
		pass.User2Input();
	    boolean result= Pass1.equals(Pass2);
		
		if (result==true)
		{
			System.out.println("both of your passwords are same");
		}
		else
		{
			System.out.println("both of your passwords are different");
		}
	}
}
