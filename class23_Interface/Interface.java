package class23_Interface;

interface  Intf1
{
	//interface can have a static method which can be accessed only using the interface name.
	static void method1() 
	{
		System.out.println("This is a concrete method inside interface1");
	}
	//interface can have method with default modifier which can be accessed with by object reference. It can be overridden or used directly
	default void method3() 
	{
		System.out.println("This is concrete method3 inside interface1");
	}
	void method2();
}
interface Intf2 extends Intf1
{
	void method4();
}

 class Interface implements Intf2
{
	public static void main(String[] args) 
	{
		Interface c1 = new Interface();
		c1.method2();
		Intf1.method1();
		c1.method3();
	}

	public void method2() 
	{
		System.out.println("This is method2 implementation inside class");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}	
}
