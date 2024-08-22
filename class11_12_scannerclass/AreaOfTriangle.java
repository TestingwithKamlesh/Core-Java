package class11_12_scannerclass;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println(" Enter the value of height of the triangle in centimeters: ");
		float height = var.nextFloat();
		
		System.out.println(" Enter the value of base of the triangle in centimeters: ");
		float base = var.nextFloat();
		
		float area_triangle = (base*height)/2;
		System.out.println("Area of circle is "+area_triangle+" square centimeters");
		
		var.close();

	}

}
