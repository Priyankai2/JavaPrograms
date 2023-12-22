package AllInterviewPrograms;

public class FindDigitFromString {

	public static void main(String[] args) {
		
		String s ="ab23gc56hj47";
		char ch[] = s.toCharArray();
		for (char c: ch)
		{
			if(Character.isAlphabetic(c))
			{
				System.out.println(c);
				
			}
			
		}
		
		
		
		
	}
	
	
	
	
}
