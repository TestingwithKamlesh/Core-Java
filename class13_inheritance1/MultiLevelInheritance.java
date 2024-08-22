package class13_inheritance1;

 class sup_Meth1
{
	void open_browser()
	{
		System.out.println("This is a grand parent class method");
	}
}
 
 class sup_Meth2 extends sup_Meth1
{
	static void close_browser()
	{
		System.out.println("This is a parent class method");
	}
}

public class MultiLevelInheritance extends sup_Meth2
{

	public static void main(String[] args) 
	{
		MultiLevelInheritance m1 = new MultiLevelInheritance();
		System.out.println("This is a child class method");
		m1.open_browser();
		close_browser();
	}
}
