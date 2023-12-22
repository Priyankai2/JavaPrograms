package ConditonalStatementClass;

public class ForEachLoop {

	public static void main(String[] args)
	{
	
		String array[]= {"i","me","my","mine","you"};
		for(String s: array ) // for each loop helps to store string into array in for loop
	
		{
			
			 System.out.println(s);
			 
			 if(s.equals("mine"))
			 
			{
			break; // keyword to break or stop the operation
			 }
			 
			 }
	
	
	}
	
	
	
	
}
