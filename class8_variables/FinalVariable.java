package class8_variables;

public class FinalVariable 
{
	final static float pi = 3.14f;
	static int r = 10;
	
	public void circle()
	{
		float circle_area=pi*r*r;
		System.out.println("Area of circle is =");
		System.out.println(circle_area);
	}
	
	public static void main(String[] args) 
	{
	FinalVariable fin = new FinalVariable();
	fin.circle();
	}
}