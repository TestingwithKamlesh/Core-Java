package class18_stringfunctions1;

import java.util.Arrays;

public class Array_sort_function {

	public static void main(String[] args) 
	{
		String Department[] = new String[5];
		Department[0]= "it";
		Department[1]= "finance";
		Department[2]= "accounts";
		Department[3]= "admin";
		Department[4]= "Test"; //if null is present in the array sorting will throw a null pointer exception
		
		Arrays.sort(Department);
		System.out.println(Arrays.toString(Department));
	}

}
