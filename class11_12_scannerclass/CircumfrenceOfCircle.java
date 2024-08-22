package class11_12_scannerclass;

import java.util.Scanner;

public class CircumfrenceOfCircle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Please Enter radius of the circle in centimeters: ");
		
		int radius = var.nextInt();
		
		double circumfrence_circle = 2*Math.PI*radius;
		System.out.println("Circumfrence of circle is "+circumfrence_circle+" centimeters");
		
		var.close();

	}

}
