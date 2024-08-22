package class18_stringfunctions1;
import java.util.Scanner;

//This program uses trim function to remove the trailing and leading spaces from any sentence.
//The is no inbuilt function in java to remove on right or only left spaces.
public class Trim_function {
	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter your text to be trimmed:");
		String Text=s1.nextLine();
		System.out.println("Your sentence after getting trimmed: " + Text.trim());
	
		s1.close();
	}
}
