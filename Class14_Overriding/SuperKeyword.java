package Class14_Overriding;

class Parent_Class
{
	void login(int a)
	{
		System.out.println("This is method in the parent class");
	}
}

class Child_Class extends Parent_Class
{
	void login(int b)
	{
		int d= 10;
		int e= 20;
		int f = d+e;
		System.out.println(f);
		System.out.println("This method is in the child class");
		super.login(5);
	}
}
public class SuperKeyword extends Child_Class
{
	public static void main(String[] args) 
	{
		SuperKeyword s1 = new SuperKeyword();
		s1.login(4);
	}

}
