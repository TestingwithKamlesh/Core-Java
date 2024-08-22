package Class14_Overriding;
import java.util.Scanner;
public class SuperKeyword1 
{
	SuperKeyword1()
	{
		System.out.println("This program can do calculations");
	}
	
	static void calculation(int a, int b)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		 a = s1.nextInt();
		
		 System.out.println("Please enter second number");
		 b = s1.nextInt();
		
		 int c = a+b;
		
		 System.out.println("The sum of two numbers is "+c);
	}
	void calculation(double a, double b)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		 a = s1.nextDouble();
		
		 System.out.println("Please enter second number");
		 b = s1.nextDouble();
		
		 double c = a*b;
		
		 System.out.println("The multiple of two numbers is "+c);
	}
	
	static void calculation(float a, float b)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		a = s1.nextFloat();
		
		System.out.println("Please enter second number");
		b = s1.nextFloat();
		
		float c = a-b;
		
		System.out.println("The substraction of two numbers is "+c);
		s1.close();
	}
	
	 void calculation()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int a = s1.nextInt();
		
		System.out.println("Please enter second number");
		int b = s1.nextInt();
		
		float c = a%b;
		
		System.out.println("The division of two numbers is "+c);
		
		this.calculation(10.1,20.3); //superkeyword cannot be used in same class concept
		
	}
	
	 public static void main(String[] args) 
	{
		SuperKeyword1 k1 = new SuperKeyword1();
		k1.calculation();
		calculation(10,20);
		calculation(11.1f,20.3f);
	}
}
