package class18_stringfunctions1;

import java.util.Arrays;

public class Array_sort_float {
	public static void main(String[] args) 
	{
		float numb[] = new float[5];
		numb[0]= 123.55f;
		numb[1]= 654.556f;
		numb[2]= 4537.42f;
		numb[3]= 64.1f;
		numb[4]= 00.00f;
		
		Arrays.sort(numb);
		System.out.println(Arrays.toString(numb));
	}
}
