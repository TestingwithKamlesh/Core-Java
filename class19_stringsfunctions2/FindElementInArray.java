package class19_stringsfunctions2;

public class FindElementInArray {

	public static void main(String[] args) 
	{
		int []array1 = new int[4];
		array1[0] = 100;
		array1[1] = 200;
		array1[2] = 300;
		array1[3] = 400;
		
		double given_num = 400.1;
		System.out.println("Given number is: "+given_num);
		
		boolean result = false;
				
		for(int i=0; i<4; i++)
		{
			if (array1[i]==given_num)
			{
				result = true;
				break;
			}
		}
		if(result)
		{
			System.out.println("This number is part of array");
		}
		else
		{
			System.out.println("Number not found");
		}
	}
}
