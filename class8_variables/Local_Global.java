package class8_variables;

public class Local_Global {
	static int age;
	String name;
	
	static void Local()
	{
		int age=20;
		double salary=30000.00;
		System.out.println(age);
		System.out.println(salary);
		System.out.println(Local_Global.age);
		Local_Global global_var=new Local_Global();
		System.out.println(global_var.name);
		
	}
	public static void main(String[] args) {
		
		Local();
	}

}
