package class11_12_scannerclass;

import java.util.Scanner;

public class CircumfrenceOfRenctangle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println(" Enter the value of length of the rectangle in centimeters: ");
		float length = var.nextFloat();
		
		System.out.println(" Enter the value of breath of the rectangle in centimeters: ");
		float breath = var.nextFloat();
		
		float Circumfrence_rectangle = 2*(breath+length);
		System.out.println("Circumfrence of rectangle is "+Circumfrence_rectangle+" centimeters");
		
		var.close();
	}
}
