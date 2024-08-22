package class10_Conditions;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = s1.nextInt();
		if (age >=18)
		{
			System.out.println("You are allowed to enter the pool");
		}
		s1.close();
	}

}
