package class11_12_scannerclass;

import java.util.Scanner;

public class AreaOfTrapezium {

	public static void main(String[] args)
	{
		Scanner var = new Scanner(System.in);
		System.out.println(" Enter value of side1 of the trapezium in centimeters: ");
		float s1 = var.nextFloat();
		
		System.out.println(" Enter value of side2 of the trapezium in centimeters: ");
		float s2 = var.nextFloat();
		
		System.out.println(" Enter height of the trapezium in centimeters: ");
		float s3 = var.nextFloat();
		
		float area_trapezium = 0.5f*(s1+s2)*s3;
		System.out.println("area of trapezium is "+area_trapezium+" centimeters");
		
		var.close();
	}

}
