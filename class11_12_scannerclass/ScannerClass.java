package class11_12_scannerclass;

import java.util.Scanner;

public class ScannerClass 
{
	byte a, b;
	
	public void UserInput()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter your first number:");
		 a=s1.nextByte();
		
		System.out.println("Pleaes enter your second number:");
		 b=s1.nextByte();
		
		s1.close();
	}

	public void multiply()
	{
		int mul = a*b;
		System.out.println("Multiplication of two numbers= "+mul);
	}
	
	public void addition()
	{
		int sum = a+b;
		System.out.println("Sum of two numbers= "+sum);
	}
	
	public void subtraction()
	{
		int sub = a-b;
		System.out.println("subtraction of two numbers= "+sub);
	}
	
	public void division()
	{
		int div = a/b;
		System.out.println("division of two numbers= "+div);
	}
	
	public void modulas()
	{
		int mod = a%b;
		System.out.println("Modulas of two numbers= "+mod);
	}
	public static void main(String[] args) 
	{
		ScannerClass vars= new ScannerClass();
		vars.UserInput();
		vars.addition();
		vars.division();
		vars.subtraction();
		vars.multiply();
		vars.modulas();
	}	
}
 