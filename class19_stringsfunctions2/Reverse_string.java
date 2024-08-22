package class19_stringsfunctions2;

public class Reverse_string {

	public static void main(String[] args) 
	{
		String Sentence = "My name is kamlesh Kumar.";
		/*variable defined inside the loop cannot be used outside the loop*/
		//to reverse the string we have to you use one empty container variable to store the output of the for loop iteration.
		String Sentence2 = ""; 
		
		for(int i=Sentence.length()-1; i>=0; i--)
		{
			 Sentence2 = Sentence2+Sentence.charAt(i);
		}
		System.out.println("Actual String is :");
		System.out.println(Sentence);
		System.out.println();
		System.out.println("Reverse of the String is :");
		 System.out.println(Sentence2);
	}
}
