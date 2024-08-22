package class6;

public class NonStaticMethod {

	public void nonStatic1()
	{
		System.out.println("This is a non-static method called in the main method");
	}
	
	 void nonStatic2(int a)
	{
		System.out.println("This is another non_static method called in the main method");
	}
	 
	public static void main(String[] args) 
	{
		NonStaticMethod n1 = new NonStaticMethod();
		n1.nonStatic1();
		n1.nonStatic2(2);

	}
}
