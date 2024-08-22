package class19_stringsfunctions2;

import java.util.Arrays;

public class CheckNumeric 
{
	public static void main(String[] args) 
	{
		String s1 = "Hno.399A, Gali no. 41, @Kesav puram, 458654";
		char c1[] = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		int count_num = 0;
		int count_space = 0;
		for(int i=0; i<c1.length; i++)
		{
			boolean c2 = Character.isDigit(c1[i]);
			boolean c3 = Character.isSpaceChar(c1[i]);
			boolean c4 = Character.isSpace(c1[i]);
			if (c2 == true)
				{
					count_num++;
				}
		
			else if (c3 == true)
				{
					count_space++;
				}
			
			System.out.println(c1[i]+" is a numeric value? --> "+c2);	
			System.out.println(c1[i]+" is a space char? -->"+c3);
		}
		
		System.out.println("Total number of numbers present = "+count_num);
		System.out.println("Total number of spaces present = "+count_space);
	}
}
