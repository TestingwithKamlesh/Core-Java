package class11_12_scannerclass;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println(" Enter the value of length of the rectangle in centimeters: ");
		float length = var.nextFloat();
		
		System.out.println(" Enter the value of breath of the rectangle in centimeters: ");
		float breath = var.nextFloat();
		
		float area_rectangle = breath*length;
		System.out.println("Area of rectangle is "+area_rectangle+" square centimeters");
		
		var.close();
	}

}
