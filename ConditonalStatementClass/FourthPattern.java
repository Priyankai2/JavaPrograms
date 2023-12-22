package ConditonalStatementClass;

public class FourthPattern {


	public static void main(String[] args)
	{
	
	 int num = 7;
	 int i, j, k;
	 
	
	  for( i=num; i>=1; i--)
		  
	  {
		  for( j= i; j< num; j++) 
		  {
			  
			  System.out.print(" "); 
		  }
		  
		  
		  for(k=1; k<=(2*i-1) ; k++)
		  {
			  System.out.print("*");//println - ln is for new line
			  
		  }
		  
		  System.out.println(); // blank sys to just print pattern on next line
	  }
	
	}
	
	
	
	
	
	
	
	
	
}
