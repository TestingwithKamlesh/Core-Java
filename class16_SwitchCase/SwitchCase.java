package class16_SwitchCase;
import java.util.Scanner;

public class SwitchCase 
{
	static Scanner s1 = new Scanner(System.in);
	static void Selection()
	{
		System.out.println("Please enter a value between 1 - 4 to launch a browser");
		System.out.println("1 = Chrome browser");
		System.out.println("2 = Edge browser");
		System.out.println("3 = Safari browser");
		System.out.println("Enter your selection: ");
	}
	public static void main(String[] args) 
	{
		Selection();
		int input = s1.nextInt();
		switch(input)
		{
			case 1:
				System.out.println("Launching chrome");
				break;
			case 2:
				System.out.println("Launching Edge");
				break;
			case 3:
				System.out.println("Launching Safari");
				break;
			default:
				System.out.println("wrong input");
		}
		s1.close();
	}

}
