package class15_SuperStatement;

public class Super_Statement extends Parent1
{
	Super_Statement()
	{
		super(1);
		//parent1 constructor without params can be called implicitly and explicitly
		System.out.println("This is child class constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		new Super_Statement();
	}
}

class Parent1
{
	public Parent1(int a)
	{
		System.out.println("This is parent1 constructor with params");
	}
	
	public Parent1()
	{
		System.out.println("This is parent1 constructor without params");
	}
}
