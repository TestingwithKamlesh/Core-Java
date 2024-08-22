package class11_12_scannerclass;

import java.util.Scanner;

public class CircumfrenceOfTriangle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println(" Enter the value of side1 of the triangle in centimeters: ");
		float s1 = var.nextFloat();
		
		System.out.println(" Enter the value of side2 of the triangle in centimeters: ");
		float s2 = var.nextFloat();
		
		System.out.println(" Enter the value of side3 of the triangle in centimeters: ");
		float s3 = var.nextFloat();
		
		float circumfrence_triangle = s1+s2+s3;
		System.out.println("circumfrence of triangle is "+circumfrence_triangle+" centimeters");
		
		var.close();
	}
}
