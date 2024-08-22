package class16_SwitchCase;

public class ThisStatement 
{
	String name;
	double salary ;
	int age;
	
	void Details (String name, double salary, int age)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
		
	}
	public static void main(String[] args) 
	{
		ThisStatement d1= new ThisStatement();
		d1.Details("Kamlesh", 90000, 32);
		System.out.println("your age is "+d1.age);
		System.out.println("your salary is "+d1.salary);
		System.out.println("your name is "+d1.name);

	}

}
