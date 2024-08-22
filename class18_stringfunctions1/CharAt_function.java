package class18_stringfunctions1;

public class CharAt_function {

	public static void main(String[] args) {
		String name = "Kamlesh Kumar";
		
		for (int i=0; i<name.length(); i++) 
		{
			/*if <= is used for length condition then "StringIndexOutOfBoundsException" is thrown because length of the string is 13 whereas index 
			 only range from 0 to 12*/
			char c1 = name.charAt(i);
			System.out.print(c1);
		}
		System.out.println(name.length());
	}
}
