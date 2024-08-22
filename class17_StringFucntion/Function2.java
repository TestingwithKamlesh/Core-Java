package class17_StringFucntion;

import java.util.Scanner;

public class Function2 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println(" Enter name of first person: ");
		String name1 = s1.nextLine();
		System.out.println(" Enter name of second person: ");
		String name2 = s1.nextLine();
		System.out.println("name of first and second person is: ");
		System.out.println(name1.equals(name2));
		System.out.println("name of first and second person is: ");
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println("name of first and second person together after concating: ");
		System.out.println(name1.concat(name2));
		s1.close();
	}
}
