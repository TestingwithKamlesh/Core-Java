package class11_12_scannerclass;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner var = new Scanner(System.in);
		System.out.println("Please Enter radius of the circle in centimeters: ");
		
		int radius = var.nextInt();
		
		double area_circle = Math.PI*radius*radius;
		System.out.println("Area of circle is "+area_circle+" square centimeters");
		
		var.close();

	}

}
