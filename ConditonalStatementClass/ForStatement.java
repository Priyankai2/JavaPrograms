package ConditonalStatementClass;

public class ForStatement {
	
	
		

		public static void main(String[] args)
		{
			
			String str ="Level";
			String s2 = new String("");
			
			
			System.out.println("Print original string = " +str);
		 
	for(int i=0; i<=4;i++) // string length -1 should be consider while print reverse string
		
		{    	char ch = str.charAt(i);	
		        s2 = ch+s2;
			    System.out.println("Print string =" +s2);
		     
			    
		}
		
	
		
		// System.out.println("Print original value of a = " +a);
		 
		 for(int i=1; i<=4;i++) // string length -1 should be consider while print reverse string
				
			 
			{    	
			 
			     int a = 1;
			   for(int j=1; j<=i;j++)
				   
			   {
				   
				   System.out.print(a++); // syso ctrl space press karna hai
			   }
			 
			 
				    System.out.println();
			     
				    
			}
		 
		
		
	
}
	
	
	
	
	
	
	
	

}
