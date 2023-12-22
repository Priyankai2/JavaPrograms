package ConditonalStatementClass;

public class ThirdPatterPyramid {

	
	public static void main(String[] args)
	{
	
	 
	
	  for(int i=0; i< 6; i++) // 6 rows                               
		  
	  {
		  for(int j=5; j> i; j--) // in each row 5 stars
		  {
			  
			  System.out.print(" "); 
		  }
		  
		  
		  for(int k=0; k<=i ; k++)
		  {
			  System.out.print("* ");//println - ln is for new line
			  
		  }
		  
		  System.out.println(); // blank sys to just print pattern on next line
	  }
	
	}
	
	
	
	
	
	
	
}
