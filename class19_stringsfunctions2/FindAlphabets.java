package class19_stringsfunctions2;
import java.util.Arrays;

public class FindAlphabets 
{
	public static void main(String[] args) 
	{
		String input = "Kendriya Vidyalaya No. 3, Delhi Cantt 10";
		char c1[] = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		int count_alpha = 0;
		for(int i=0; i<c1.length; i++)
		{
			boolean response = Character.isAlphabetic(c1[i]); //it is function to check if the character present at the index value is alphabet or not
			System.out.println(c1[i]+" is a alpabatic value? -->"+response);
			
			
			if(response == true)
			{
				
				count_alpha++;
			}
		}
		System.out.println("Total number of alphabets present = "+count_alpha);
	}
}