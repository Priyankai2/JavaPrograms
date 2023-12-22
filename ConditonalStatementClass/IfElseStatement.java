package ConditonalStatementClass;

public class IfElseStatement {

	

	public static void main(String[] args) {
		
		int a =30;
		int b= 20;
		
		if (a>b)
			{
			System.out.println("It is true");
			//System.out.println("It is False");
			}
	    else {
			
			System.out.println("It is False");
	         }
		
		
		String s1= "oohoo";
		String s2 ="Level";
		String sb = new String(s1);
		String sb1 = new String(s2);
		 if(s1.equals(sb) && sb1.equals(sb1))  // by using == address match hota hai value nahi need to use equals method
		 {
				System.out.println("Strings are same");
			 
			 
		 }
		 else 
		 
		 {
			 System.out.println("Strings are not same");
			 
		 }
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
}
