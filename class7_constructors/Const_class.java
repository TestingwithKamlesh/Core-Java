package class7_constructors;

public class Const_class 
{
	
	Const_class()
	{
		System.out.println("This is a constructor without params");
	}
	
	public Const_class(int a)
	{
		System.out.println("This is a parameterized constructor");
	}
	
	Const_class(String a, char b)
	{
		System.out.println("This is another parameterized constructor method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Const_class();
		new Const_class(100);
		new Const_class("Kamlesh",'S');

	}

}
