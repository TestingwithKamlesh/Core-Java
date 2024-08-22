package class17_StringFucntion;
import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = s1.nextLine();
		System.out.println("your name has "+name.length()+" charcters");
		System.out.println("Your name after removing spaces from front and back");
		System.out.println(name.trim()); //removes spaces from start and end of the string
		System.out.println("Your name in uppercase: ");
		System.out.println(name.toUpperCase());
		System.out.println("Your name in lowercase: ");
		System.out.println(name.toLowerCase());
		System.out.println("Enter a number to find the letter you your name at that index value :");
		int a = s1.nextInt();
		System.out.println("character at the index value "+a+" is "+name.charAt(a));
		System.out.println(name.substring(10));
		System.out.println(name.substring(10, 15));
		System.out.println(name.indexOf('A', 5)); //finds the index value of the char present after the index value you have provides in the param.
		s1.close();
	}
}
