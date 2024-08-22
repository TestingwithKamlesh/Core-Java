package class7_constructors;

public class MethodOverloading 
{
	
	public void Login(long phone)
	{
		System.out.println("Login with your phone number");
	}
	
	static void Login(String emailid)
	{
		System.out.println("Login with your email id");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading user_input = new MethodOverloading();
		
		user_input.Login(9999988899l);
		Login("automation44@growtechminds.com");

	}

}
