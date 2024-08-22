package class15_SuperStatement;

public class This_Statement extends calculation
{
	This_Statement()
	{
		this("Kamlesh");
		System.out.println("This construnctor is in main class without params");
	}
	
	This_Statement(String name)
	{
		System.out.println("This construnctor is in main class with params");
	}
	
	public static void main(String[] args) 
	{
		This_Statement t1 = new This_Statement();
		t1.Calculator();
		t1.Calculator(10.0, 11.10);
	}
}

class calculation
{
	void Calculator (int a, int b)
	{
		int c=a+b;
		System.out.println("sum of a+b= "+c);
	}
	
	void Calculator (double a, double b)
	{
		double c = a*b;
		System.out.println("multiple of a*b= "+c);
	}
	
	void Calculator ()
	{
		System.out.println("perform addition and multiplication");
		this.Calculator(5,15);
	}
}