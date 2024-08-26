package class21_StringFunctions3;

public class ReplaceFunction {

	public static void main(String[] args) 
	{
			String name = "Kamlesh kumar";
			String new_name = name.replace('K', 'A'); //replace a char with another char
			System.out.println(new_name);
			
			String new_name1 = name.replaceAll(" ",""); //remove all spaces from a string
			System.out.println(new_name1);
			
			String name1 = "Avinash Gadve";
			String new_name2 = name1.replaceAll("[A-Z]", ""); //remove all upper cases from a string
			System.out.println(new_name2);
			
			String name2 = "Rakesh Roshan";
			String new_name3 = name2.replaceAll("[a-z]", ""); //remove all lower cases from a string
			System.out.println(new_name3);
			
			String name3 = "K V number 3, Delhi Cantt 10";
			String new_name4 = name3.replaceAll("[0-9]", ""); //remove all lower cases from a string
			System.out.println(new_name4);
	}

}
