package class5_staticmethods;

public class Staticmethod1 {
	
	static void Addition() 
	{
		System.out.println("This is a static method called in the main method");
	}

	public static boolean checkBoolean(int a)
	{
		System.out.println("True");
		return true;
	}
	
	public static void main(String[] args) 
	{
		Addition();
		int a = 10;
		checkBoolean(a);
	}
}
