//Assignment 43 WAP on abstraction(try to write logic inside method)

package class22_Abstract;

abstract class ABS1
{
	abstract void method1();
	{
		System.out.println("This is inside abstract class");
	}
}

public class Assignment_43 extends ABS1
{
	public static void main(String[] args) 
	{
		Assignment_43 a1 = new Assignment_43();
		a1.method1();
		a1.method2();
	}
	void method2()
	{
		System.out.println("This is inside concrete method");
	}
	@Override
	void method1() 
	{
		System.out.println("This is overriden abs method");
	}

}
