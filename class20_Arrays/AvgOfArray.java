package class20_Arrays;

public class AvgOfArray 
{
	public static void main(String[] args) 
	{
		int salary[] = new int[4];
		salary[0] = 50001;
		salary[1] = 65000;
		salary[2] = 99000;
		salary[3] = 199000;
		
		double sum = 0;
		for(int i=0; i<=3; i++)
		{
			sum = sum+salary[i];
		}
		double avg = sum/4;
		System.out.println("Average of the array is: "+avg);
	}
}
