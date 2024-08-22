package class19_stringsfunctions2;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsEqual {
	static Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Please choose the size of Array1");
		int size1 = s1.nextInt();
		System.out.println("Please choose the size of Array2");
		int size2 = s1.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		for(int i=0; i<size1; i++)
		{
			System.out.println("Please provide integer input to store at array1 index: "+i);
			arr1[i]=s1.nextInt();
		}
	
		
		for(int j=0; j<size2; j++)
		{
			System.out.println("Please provide integer input to store at array2 index: "+j);
			arr2[j]=s1.nextInt();
		}
		
		boolean isequals = Arrays.equals(arr1, arr2);
		if(isequals==true)
		{
			System.out.println("both the arrays sets are equal");
		}
		else
		{
			System.out.println("both arrays sets are different");
		}
		System.out.println("Your array1 set is: ");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("Your array1 set is: ");
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
