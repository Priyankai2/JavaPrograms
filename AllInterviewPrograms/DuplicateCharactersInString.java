package AllInterviewPrograms;

public class DuplicateCharactersInString {
	
	
	public static void main(String[] args) {
		
		String s  = "Program";          // string
		char [] ch = s.toCharArray();  // converting string into char array
		//int j =0;
		for(int i =0; i< s.length(); i++) // to check string from p
		{
			int count = 0;
			 
			for(int k =0; k< ch.length; k++)   //  
			{
				if (s.charAt(i) == ch[k])  // checking string is converted into Array or not
					
				{
					
					count++;
				}	
			}
			
			
			System.out.println(s.charAt(i)+ "  =  " + count);
			 if (count> 1)
				 
			 {
				 s =s.replaceAll(String.valueOf(s.charAt(i)), "");
			 }
				 
				 
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
