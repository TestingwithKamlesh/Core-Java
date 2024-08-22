package class19_stringsfunctions2;
public class CheckSpclChars {

	public static void main(String[] args) 
	{
		String pass= "K@mle$h Kum@R";
		char p1[] = pass.toCharArray();
		int count_alpha = 0;
		int count_space = 0;
		int count_num = 0;
		int count_spcl = 0;
		for(int i=0; i<p1.length; i++)
		{
			boolean alpha = Character.isAlphabetic(p1[i]);
			boolean num = Character.isDigit(p1[i]);
			boolean space = Character.isSpaceChar(p1[i]);
			
			if(alpha==true)
			{
				count_alpha++;
			}
			else if(num==true)
			{
				count_num++;
			}
			else if (space==true)
			{
				count_space++;
			}
			else
			{
				count_spcl++;
			}
		}
		System.out.println("special characters present in the pass: "+ count_spcl);
		System.out.println("numeric characters present in the pass: "+ count_num);
		System.out.println("Spaces present in the pass: "+ count_space);
		System.out.println("Alphabets present in the pass: "+ count_alpha);
	}
}
