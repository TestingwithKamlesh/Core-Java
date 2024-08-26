package class23_Interface;
//Assignment 44 WAP on intrface(try to write logic inside methods) 

interface login
{
	void userid();
	void pass();
}

interface details
{
	void salary();
	void name();
}
public class Assignment_44 implements login,details
{
	public static void main(String[] args) 
	{
		Assignment_44 a1 = new Assignment_44();
		a1.pass();
		a1.userid();
		a1.salary();
	}

	@Override
	public void userid() 
	{
		System.out.println("user id is required for login");
	}

	@Override
	public void pass() 
	{
		System.out.println("password is required for login");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
}
