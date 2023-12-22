package AllInterviewPrograms;

public class PalindromeIntergerNumber {
	
	public static void main(String[] args) {
		
	
	
	int a =12221;
	String s = String.valueOf(a);   // saved
    System.out.println("Saved int value in string = " +s);
	StringBuffer sb = new StringBuffer(s);
	sb.reverse();
	
	int i = Integer.parseInt(sb.toString());
	  System.out.println("Saved string value in integer = " +i);
	
	if(a == i)
	{
		 System.out.println("Integer is palindrome ");
		
	}
	

	}
}
