package class20_Arrays;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		double salary[] = new double[5];
		salary[0] = 50000;
		salary[1] = 65000;
		salary[2] = 99000;
		salary[3] = 199000;
		salary[4] = 299000;
		System.out.println(Arrays.toString(salary));
		double salary2[] = new double[5];
		
		for(int i=4;i>=0;i--)
		{
			salary2[i] = salary[4-i];
		}
		System.out.println("reverse of array is: ");
		System.out.println(Arrays.toString(salary2));
	}
}
