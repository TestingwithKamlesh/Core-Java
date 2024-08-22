package class19_stringsfunctions2;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		double salary[] = new double[3];
		salary[0] = 50000;
		salary[1] = 65000;
		salary[2] = 99000;
		
		double salary2[] = new double[3];
		
		for(int i=0; i<3; i++)
		{
			salary2[i] = salary[i];
		}
		
		System.out.println(Arrays.toString(salary2));
		System.out.println(Arrays.toString(salary));
	}
}
