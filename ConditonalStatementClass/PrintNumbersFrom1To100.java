package ConditonalStatementClass;

public class PrintNumbersFrom1To100 
{
	
	public static void main(String[] args)
	{
		evenNum();
		oddNum();
		primeNumbers();
	}
		
		public static void evenNum()
		  {
			
			 System.out.println("\n Even Numbers from 1 to 100 =  "); 
		 
			 for(int i=1; i<=100; i++) 
		     {
		
		
		       	 if(i%2 == 0) {
			  System.out.print(i+" "); 
		                      }
		    }
		  }
	  
		public static void oddNum()
		  {
			
			 System.out.println("\n Odd Numbers from 1 to 100 =  "); 
		 
			 for(int i=1; i<=100; i++) 
		     {
		
		
		       	 if(i%2 != 0) {
			  System.out.print(i+" "); 
		                      }
		    }
			 
			  System.out.print("\n "); 
		  }
	      
		    
		public static void primeNumbers()
		  {
			//int a = 7;
			System.out.println("Prime number = ");
			 for(int a=1; a<= 100; a++) {
			
			int count = 0;
			// System.out.println("\n Prime Numbers from 1 to 100 =  "); 
		 
			 for(int i=1; i<= a/2; i++) 
		     {
		
		      int b =a % i;
		     // System.out.println("b =" +b);  
		       	 if(b == 0) {
			       count++; 
			       //System.out.println("Count =" +count);  
		                      }
		    }
			 
			 if(count== 1)
			 {
				 System.out.println("Number is Prime Number"); 
				 
			 }
			 
			 else {
				 System.out.println("Number is not Prime Number"); 
			 }
			 
		  }   
		    
		  } 	 
		
		
		  
		
		
	
		  
}
