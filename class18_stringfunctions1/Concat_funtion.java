package class18_stringfunctions1;

//This program uses "concat" string function to compare to add two different strings.

import java.util.Scanner;

public class Concat_funtion {
	
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
		Concat_funtion pass = new Concat_funtion();
		pass.User1Input();
		pass.User2Input();
		System.out.println(Pass1.concat(Pass2));
	}
}
