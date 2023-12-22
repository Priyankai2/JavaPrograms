package String;

public class StringBuilderClass {
	
	// slow -stringbuffer, fast-string  ,fastest-Stringbuilder
	
	public static void main(String[] args)  
	
	{
		
		StringBuilder s = new StringBuilder("Program");
		System.out.println(s);
		s.append("Java");
		System.out.println("String after Append " +s);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
