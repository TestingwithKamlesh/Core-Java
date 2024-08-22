package class8_variables;

public class LocalVariable 
{
	public static void Local1()
	{
		int a;
		a=10;
		System.out.println("The value of local variable a=" +a);
		
	}
	public static void main(String[] args) 
	{
		int a = 30;
		int b = 20;
		//System.out.println("The sum of a + b="+ a+b); //the output for this line comes as "The sum of a + b=3020"
		System.out.println("The sum of a + b="+ (a+b)); //this line will give proper expected output
		Local1();
		System.out.println("The value of local variable present in main method is a=30 and b=20");
	}

}
