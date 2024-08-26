package class22_Abstract;

abstract class AbsMethods
{
	abstract  void add();
	abstract void substract();
	void multiply()
	{
		int a = 2;
		int b = 2;
		int c = a*b;
		System.out.println(c);
	}
}

class ConcMethods extends AbsMethods
{
	void divide()
	{
		int a = 2;
		int b = 2;
		int c = a/b;
		System.out.println(c);
	}

	@Override
	void add() {
		int a = 2;
		int b = 2;
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	void substract() {
		int a = 2;
		int b = 2;
		int c = a-b;
		System.out.println(c);
	}
}

public class AbstractMethods extends ConcMethods
{
	public static void main(String[] args) 
	{
		ConcMethods a1 = new ConcMethods();
		a1.divide();
		a1.add();
		a1.divide();
		a1.multiply();
		a1.substract();
	}
}
