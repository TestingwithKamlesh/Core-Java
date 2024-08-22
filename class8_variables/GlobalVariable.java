package class8_variables;

public class GlobalVariable 
{
	static float a = 11.11f;
	static double b = 123.564;
	
	public void multiply()
	{
		int d = 56;
		b=100.00; //updated the value of global variable
		double m = b*d;
		System.out.println("multiplication using global variable inside a method");
		System.out.println(m);
	}
	
	public static void main(String[] args) 
	{
		double c = a+b;
		System.out.println("addition of a+b="+c);
		GlobalVariable Num = new GlobalVariable();
		Num.multiply();
	}
}
