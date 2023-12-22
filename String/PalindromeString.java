package String;

public class PalindromeString {
	
	public static void main(String[] args)
	
	{
		String s1= "oho";
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String rs = sb.toString();
		System.out.println("Actaual string ="+s1);
		System.out.println("Reverse string ="+rs);
		System.out.println("String is Palindrome ="+s1.equals(rs)); // palindrom method shows whether the string is 
		                                                             // same after writing and reading it from both ends
		
	}

}
