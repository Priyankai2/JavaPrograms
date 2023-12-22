package AllInterviewPrograms;

public class FindVowelsInString {

	public static void main(String[] args) {
		
		String str ="Priyanka Ingle Avyaan";
		char [] vowel = {'a','e','i','o','u'};
		
		for(int j =0; j< str.length(); j++)
		{
			
			for(int i =0; i< vowel.length; i++)
			{
				if(vowel[i] == str.charAt(j))
				{

					System.out.println(str.charAt(j));
					
				}
				
				
			}
		}
		
			
	}

	
}
