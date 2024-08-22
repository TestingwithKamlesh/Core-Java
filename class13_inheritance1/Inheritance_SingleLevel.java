package class13_inheritance1;

class Super_class 
{
	public static void sup_method()
	{
		System.out.println("This is method in super class");
	} 
	
}

public class Inheritance_SingleLevel extends Super_class
{
	public static void main(String[] args) 
	{
		System.out.println("This is main method in sub class");
		sup_method();
	}

}
